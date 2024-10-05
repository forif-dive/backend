package org.forif.subwayapp.repository;

import org.forif.subwayapp.entity.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Long> {
}
