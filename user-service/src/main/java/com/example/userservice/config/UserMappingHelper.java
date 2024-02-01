package com.example.userservice.config;

import com.example.userservice.dtos.requests.UserDto;
import com.example.userservice.models.User;

public interface UserMappingHelper {
    public static UserDto map(final User user) {
        return UserDto.builder()
                .userId(user.getUserId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .imageUrl(user.getImageUrl())
                .email(user.getEmail())
                .phone(user.getPhone())
                .build();
    }

    public static User map(final UserDto userDto) {
        return User.builder()
                .userId(userDto.getUserId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .imageUrl(userDto.getImageUrl())
                .email(userDto.getEmail())
                .phone(userDto.getPhone())
                .build();
    }
}
