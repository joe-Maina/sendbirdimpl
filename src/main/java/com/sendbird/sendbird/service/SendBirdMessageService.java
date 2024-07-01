package com.sendbird.sendbird.service;

import com.sendbird.sendbird.dto.messageDto.CreateMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
@Service
@Slf4j
public class SendBirdMessageService {

    private final RestClient restClient;

    public SendBirdMessageService() {
        restClient = RestClient.builder()
                .baseUrl("https://api-5A361CFF-C038-4146-A5CC-E9E6E49BA755.sendbird.com")
                .defaultHeader("API-Token", "ebff85ac1f2da53397b14a52a8c943dd902a493f")
                .build();
    }

    public CreateMessageDto sendMessage(CreateMessageDto createMessageDto,
                                            String channel_type,
                                            String channel_url){
        log.info("createMessage Dto :{} channelType :{} channelUrl :{}", createMessageDto , channel_type , channel_url);
        return restClient.post()
                .uri("/v3/" + channel_type + "/" + channel_url + "/messages" )
                .contentType(MediaType.APPLICATION_JSON)
                .body(createMessageDto)
                .retrieve()
                .body(CreateMessageDto.class);
    }
}
