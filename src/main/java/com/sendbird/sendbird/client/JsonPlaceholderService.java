package com.sendbird.sendbird.client;

import com.sendbird.sendbird.dto.userDto.UsersDto;
import org.springframework.web.service.annotation.GetExchange;

public interface JsonPlaceholderService {

    @GetExchange("/v3/users")
    UsersDto findAll();

}
