package com.subway.subway_app.controller

import com.subway.subway_app.dto.UserDTO
import com.subway.subway_app.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService: UserService) {
    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<UserDTO> {
        val user = userService.getUserById(id)
        return ResponseEntity.status(HttpStatus.OK).body(user)
    }

    @PostMapping
    fun createUser(@RequestBody userDTO: UserDTO): ResponseEntity<UserDTO> {
        val createdUser = userService.createUser(userDTO)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser)
    }

    @DeleteMapping("{id}")
    fun deleteUserById(@PathVariable id: Long){
        return userService.deleteUserById(id)
    }

}