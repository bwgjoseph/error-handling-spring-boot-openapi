package com.bwgjoseph.error_handling_spring_boot_openapi.building;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/buildings")
public class BuildingController {
    @GetMapping("/{buildingId}")
    public Building getMethodName(@PathVariable String buildingId) {
        return new Building(buildingId, "building");
    }
}
