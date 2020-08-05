package com.sddk.demo.springvaultdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("public")
@Data // getters setters are vital for config
public class PublicConfig {
  private String key;
}
