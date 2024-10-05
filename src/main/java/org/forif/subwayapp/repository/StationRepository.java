package org.forif.subwayapp.repository;

import org.forif.subwayapp.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
