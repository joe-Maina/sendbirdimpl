package com.sendbird.sendbird.dto.userDto;

import java.util.List;

public record UsersDto(
        List<UsersDto> users,

        String next

) {
}
