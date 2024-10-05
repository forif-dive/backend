package org.forif.subwayapp.service;

import lombok.AllArgsConstructor;
import org.forif.subwayapp.dto.AttractionRequest;
import org.forif.subwayapp.dto.StationCreateRequest;
import org.forif.subwayapp.entity.Attraction;
import org.forif.subwayapp.entity.Station;
import org.forif.subwayapp.repository.AttractionRepository;
import org.forif.subwayapp.repository.StationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StationService {
    private final StationRepository stationRepository;
    private final AttractionRepository attractionRepository;

    public void createStation(StationCreateRequest request) {
        Station station = new Station();
        station.setName(request.getName());
        station.setLatitude(request.getLatitude());
        station.setLongitude(request.getLongitude());
        station.setDailyPassengers(request.getDailyPassengers());

        List<Attraction> attractionEntities = new ArrayList<>();
        if (request.getAttractions() == null) {
            station.setAttractions(attractionEntities);
            stationRepository.save(station);
            return;
        }

        for (AttractionRequest attractionRequest : request.getAttractions()) {
            {
                Attraction attraction = new Attraction();
                attraction.setName(attractionRequest.getName());
                attraction.setLatitude(attractionRequest.getLatitude());
                attraction.setLongitude(attractionRequest.getLongitude());
                attraction.setDescription(attractionRequest.getDescription());
                attraction.setStation(station); // 연관 관계 설정
                attractionEntities.add(attraction);
            }
        }
        station.setAttractions(attractionEntities);
        stationRepository.save(station);
    }

    public Station getStationById(Long id) {
        return stationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Station not found"));
    }

    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }
}
