package com.sendbird.sendbird.controller;

import com.sendbird.sendbird.dto.userDto.UserDto;
import com.sendbird.sendbird.dto.userDto.UsersDto;
import com.sendbird.sendbird.service.SendBirdUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class SendBirdUserController {
    public final SendBirdUserService sendBirdUserService;

    public SendBirdUserController(SendBirdUserService sendBirdUserService){
        this.sendBirdUserService = sendBirdUserService;
    };

    @GetMapping
    public UsersDto findAll (){
        return sendBirdUserService.findAll();
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto){
        return sendBirdUserService.createUser(userDto);
    }

}
