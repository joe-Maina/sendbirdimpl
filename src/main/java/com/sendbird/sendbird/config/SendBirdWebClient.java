package com.sendbird.sendbird.config;

import com.sendbird.sendbird.client.JsonPlaceholderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class SendBirdWebClient {
    @Bean
    JsonPlaceholderService jsonPlaceholderService() {
        RestClient client = RestClient.create("https://api-5A361CFF-C038-4146-A5CC-E9E6E49BA755.sendbird.com");
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(client))
                .build();
        return factory.createClient(JsonPlaceholderService.class);
    }
}
