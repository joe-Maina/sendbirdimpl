package com.sendbird.sendbird.controller;

import com.sendbird.sendbird.dto.messageDto.CreateMessageDto;
import com.sendbird.sendbird.service.SendBirdMessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message")
public class SendBirdMessageController {

    public final SendBirdMessageService sendBirdMessageService;

    public SendBirdMessageController(SendBirdMessageService sendBirdMessageService){
        this.sendBirdMessageService = sendBirdMessageService;
    }

    @PostMapping
    public CreateMessageDto createMessage(@RequestBody CreateMessageDto createMessageDto,
                                          @RequestParam(name = "channel_type" , required = false) String channel_type,
                                          @RequestParam(name = "channel_url") String channel_url){
        return sendBirdMessageService.sendMessage(createMessageDto,channel_type,channel_url);
    }
}
