package org.forif.subwayapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttractionRequest {
    private String name;
    private Double latitude;
    private Double longitude;
    private String description;
}
