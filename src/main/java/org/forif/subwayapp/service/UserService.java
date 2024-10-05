package org.forif.subwayapp.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.forif.subwayapp.entity.SubwayUser;
import org.forif.subwayapp.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public SubwayUser getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not found"));
    }
}
