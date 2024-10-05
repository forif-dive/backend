package org.forif.subwayapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    @Column(length = 1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "station_id")
    @JsonBackReference
    private Station station;

}
