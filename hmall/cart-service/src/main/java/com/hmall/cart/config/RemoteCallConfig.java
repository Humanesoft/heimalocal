package com.hmall.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RemoteCallConfig
 * @Description TODO
 * @Author 86152
 * @DATE 2024/10/10 16:41
 * @Version 1.0
 */
@Configuration
public class RemoteCallConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
