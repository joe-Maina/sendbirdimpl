package com.sendbird.sendbird.dto.messageDto;

import java.util.List;

public record CreateMessageDto(
        String message_type,

        String user_id,

        String message,

        String channel_type,

        String channel_url,

        String data,

        Boolean send_push,

        String mention_type,

        List<String> mentioned_user_ids,

        String is_silent,


        String created_at,

        String dedup_id,

        String apns_bundle_id,

        String sound,

        String volume

) {
}
