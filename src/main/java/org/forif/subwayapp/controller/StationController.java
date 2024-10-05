package org.forif.subwayapp.controller;

import lombok.AllArgsConstructor;
import org.forif.subwayapp.dto.StationCreateRequest;
import org.forif.subwayapp.service.StationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/stations")
public class StationController {
    private final StationService stationService;
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping
    public ResponseEntity<Void> createStation(
            @RequestBody StationCreateRequest request
    ) {
        stationService.createStation(request);

        return ResponseEntity.status(201).build();
    }
}
