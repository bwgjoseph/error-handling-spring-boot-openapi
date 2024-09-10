package com.bwgjoseph.error_handling_spring_boot_openapi.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwgjoseph.error_handling_spring_boot_openapi.MyBusinessException;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {
    @GetMapping("/{profileId}")
    public Profile findOne(@PathVariable String profileId) {
        if (profileId.equals("2")) {
            throw new MyBusinessException("profile");
        }
        return new Profile(profileId, "profile");
    }
}
