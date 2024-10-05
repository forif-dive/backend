package org.forif.subwayapp.controller;

import lombok.AllArgsConstructor;
import org.forif.subwayapp.dto.AttractionResponse;
import org.forif.subwayapp.service.AttractionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/attractions")
public class AttractionController {
    private final AttractionService attractionService;

    @GetMapping
    public ResponseEntity<List<AttractionResponse>> getAttractions() {
        return ResponseEntity.status(200).body(attractionService.getAttractions());
    }
}
