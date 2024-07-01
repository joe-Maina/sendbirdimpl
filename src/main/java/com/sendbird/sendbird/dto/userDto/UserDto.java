package com.sendbird.sendbird.dto.userDto;

import java.util.List;

public record UserDto(String user_id,
                      String nickname ,
                      String profile_url,

                      String require_auth_for_profile_image,

                      String created_at,

                      String is_hide_me_from_friend,

                      Boolean is_online,

                      Long last_seen_at,

                      Boolean is_active,

                      Boolean has_ever_logged_in,

                      List<String> preferred_languages,

                      List<String> discovery_keys,

                      String phone_number
                      ) {
}
