package com.sendbird.sendbird.service;

import com.sendbird.sendbird.dto.channelDto.CreateChannelDto;
import com.sendbird.sendbird.dto.channelDto.GetChannelsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@Slf4j
public class SendBirdChannelService {

    private final RestClient restClient;

    public SendBirdChannelService() {
        restClient = RestClient.builder()
                .baseUrl("https://api-5A361CFF-C038-4146-A5CC-E9E6E49BA755.sendbird.com")
                .defaultHeader("API-Token", "ebff85ac1f2da53397b14a52a8c943dd902a493f")
                .build();
    }

    public GetChannelsDto getGroupChannels(){
        return restClient.get()
                .uri("/v3/group_channels")
                .retrieve()
                .body(new ParameterizedTypeReference<GetChannelsDto>() {
                });
    }

    public CreateChannelDto createGroupChannel(CreateChannelDto createChannelDto){
        log.info("The user dto is : {}" , createChannelDto);
        return restClient.post()
                .uri("/v3/group_channels")
                .contentType(MediaType.APPLICATION_JSON)
                .body(createChannelDto)
                .retrieve()
                .body(CreateChannelDto.class);
    }

}
