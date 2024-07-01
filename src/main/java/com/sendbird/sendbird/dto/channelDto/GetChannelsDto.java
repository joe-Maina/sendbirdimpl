package com.sendbird.sendbird.dto.channelDto;

import java.util.List;

public record GetChannelsDto(
        List<CreateChannelDto> channels,

        String next,

        Long ts
) {
}
