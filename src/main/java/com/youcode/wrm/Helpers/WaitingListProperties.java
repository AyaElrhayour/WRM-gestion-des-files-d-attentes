package com.youcode.wrm.Helpers;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "waiting-list")
public class WaitingListProperties {
    private String algorithm;
    private Integer capacity;

}
