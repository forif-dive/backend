package com.subway.controller

import com.subway.dto.UserDTO
import com.subway.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/users")
class UserController(private val userService: UserService) {

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): ResponseEntity<UserDTO> {
        val user = userService.getUserById(id)
        return ResponseEntity.ok(user)
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