package com.subway.subway_app.service

import com.subway.subway_app.dto.UserDTO
import com.subway.subway_app.model.User
import com.subway.subway_app.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getUserById(id: Long): UserDTO {
        val user = userRepository.findById(id).orElseThrow { RuntimeException("User not found") }
        return UserDTO(user.id, user.name, user.email)
    }

    fun createUser(userDTO: UserDTO): UserDTO {
        val user = User(name = userDTO.name, email = userDTO.email)
        val savedUser = userRepository.save(user)
        return UserDTO(savedUser.id, savedUser.name, savedUser.email)
    }

    fun deleteUserById(id: Long){
        userRepository.findById(id).orElseThrow { RuntimeException("User not found") }
        userRepository.deleteById(id)
    }


}