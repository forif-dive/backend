package org.forif.subwayapp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stationId;
    private String name;
    private Long dailyPassengers;
    private Double latitude;
    private Double longitude;

    @OneToMany(mappedBy = "station", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Attraction> attractions;

}
