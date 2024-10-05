package org.forif.subwayapp.controller;

import lombok.AllArgsConstructor;
import org.forif.subwayapp.entity.SubwayUser;
import org.forif.subwayapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping({"/{id}"})
    public ResponseEntity<SubwayUser> getUserById(
            @PathVariable Long id
    ) {
        return ResponseEntity.status(200).body(userService.getUserById(id));
    }
}
