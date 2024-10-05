package org.forif.subwayapp.service;

import lombok.AllArgsConstructor;
import org.forif.subwayapp.dto.AttractionResponse;
import org.forif.subwayapp.repository.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AttractionService {
    private final AttractionRepository attractionRepository;

    public List<AttractionResponse> getAttractions() {
        return attractionRepository.findAll()
                .stream().map(attraction -> {
                    AttractionResponse response = new AttractionResponse();
                    response.setStation_name(attraction.getStation().getName());
                    response.setName(attraction.getName());
                    response.setLatitude(attraction.getLatitude());
                    response.setLongitude(attraction.getLongitude());
                    response.setDescription(attraction.getDescription());
                    return response;
                }).toList();
    }

}
