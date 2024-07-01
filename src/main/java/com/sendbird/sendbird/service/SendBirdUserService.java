package com.sendbird.sendbird.service;

import com.sendbird.sendbird.dto.userDto.UserDto;
import com.sendbird.sendbird.dto.userDto.UsersDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@Slf4j
public class SendBirdUserService {

    private final RestClient restClient;

    public SendBirdUserService() {
        restClient = RestClient.builder()
                .baseUrl("https://api-5A361CFF-C038-4146-A5CC-E9E6E49BA755.sendbird.com")
                .defaultHeader("API-Token", "ebff85ac1f2da53397b14a52a8c943dd902a493f")
                .build();
    }

    public UsersDto findAll() {
        return restClient.get()
                .uri("/v3/users")
                .retrieve()
                .body(new ParameterizedTypeReference<UsersDto>() {
                });
    }

    public UserDto createUser(UserDto userDto){
        return restClient.post()
                .uri("/v3/users")
                .contentType(MediaType.APPLICATION_JSON)
                .body(userDto)
                .retrieve()
                .body(UserDto.class);
    }
}
