package com.example.userservice.controllers;

import com.example.userservice.dtos.requests.UserDto;
import com.example.userservice.dtos.responses.DtoCollectionResponse;
import com.example.userservice.services.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody
                                        @NotNull(message = "Input must not NULL")
                                        @Valid final UserDto userDto){

        log.info("*** UserDto, resource; save user *"+userDto.getEmail());
        return ResponseEntity.ok(this.userService.save(userDto));

    }

    @GetMapping
    public ResponseEntity<DtoCollectionResponse<UserDto>> findAll(){
        log.info("*** UserDto List, controller; fetch all users *");
        return ResponseEntity.ok(new DtoCollectionResponse<UserDto>(this.userService.findAll()));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> findById(@PathVariable("userId") @NotBlank(message = "Input must not NULL") @Valid final String userId){
        return ResponseEntity.ok(this.userService.findById(Integer.parseInt(userId.strip())));
    }


}
