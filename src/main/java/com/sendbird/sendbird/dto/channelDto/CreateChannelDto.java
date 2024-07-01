package com.sendbird.sendbird.dto.channelDto;

import java.util.*;

public record CreateChannelDto(
        List<String> user_ids,

        String name,

        String channel_url,

        String cover_file,

        String custom_type,

        String data,

        String is_distinct,

        String is_public,

        Boolean is_ephemeral,

        Boolean strict,

        Boolean block_sdk_user_channel_join,

        List<String> operator_ids
) {
}
