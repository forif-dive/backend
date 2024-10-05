package org.forif.subwayapp.repository;

import org.forif.subwayapp.entity.SubwayUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SubwayUser, Long> {
}
