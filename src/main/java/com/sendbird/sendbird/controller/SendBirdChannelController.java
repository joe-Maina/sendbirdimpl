package com.sendbird.sendbird.controller;

import com.sendbird.sendbird.dto.channelDto.CreateChannelDto;
import com.sendbird.sendbird.dto.channelDto.GetChannelsDto;
import com.sendbird.sendbird.service.SendBirdChannelService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/channel")
public class SendBirdChannelController {
    public final SendBirdChannelService sendBirdChannelService;

    public SendBirdChannelController(SendBirdChannelService sendBirdChannelService){
        this.sendBirdChannelService = sendBirdChannelService;
    };

    @PostMapping
    public CreateChannelDto createChannel (@RequestBody CreateChannelDto createChannelDto){
       return sendBirdChannelService.createGroupChannel(createChannelDto);
    }

    @GetMapping
    private GetChannelsDto getGroupChannels () {
        return sendBirdChannelService.getGroupChannels();
    }
}
