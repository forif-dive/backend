package org.forif.subwayapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StationCreateRequest {
    private String name;
    private Double latitude;
    private Double longitude;
    private Long dailyPassengers;
    private List<AttractionRequest> attractions;
}
