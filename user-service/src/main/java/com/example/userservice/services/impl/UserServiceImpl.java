package com.example.userservice.services.impl;

import com.example.userservice.config.UserMappingHelper;
import com.example.userservice.dtos.requests.UserDto;
import com.example.userservice.exception.UserObjectNotFoundException;
import com.example.userservice.repositories.UserRepository;
import com.example.userservice.services.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserDto save(UserDto userDto) {

        return UserMappingHelper.map(this.userRepository.save(UserMappingHelper.map(userDto)));
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(UserMappingHelper::map).distinct().collect(Collectors.toUnmodifiableList());
    }

    @Override
    public UserDto findById(int userId) {
        return userRepository.findById(userId).map(UserMappingHelper::map).orElseThrow(() -> new UserObjectNotFoundException(String.format("User with id: %d not found", userId)));
    }
}
