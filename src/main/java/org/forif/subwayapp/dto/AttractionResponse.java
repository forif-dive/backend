package org.forif.subwayapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttractionResponse {
    private String name;
    private String station_name;
    private Double latitude;
    private Double longitude;
    private String description;
}
