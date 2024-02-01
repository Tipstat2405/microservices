package com.example.userservice.services;

import com.example.userservice.dtos.requests.UserDto;
import com.example.userservice.dtos.responses.DtoCollectionResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    UserDto save(final UserDto userDto);

    List<UserDto> findAll();

    UserDto findById(int userId);
}
