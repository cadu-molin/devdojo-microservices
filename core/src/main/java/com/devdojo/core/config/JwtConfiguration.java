package com.devdojo.core.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt.config")
@Getter
@Setter
@ToString
public class JwtConfiguration {

    private String loginUrl = "/login/**";
    @NestedConfigurationProperty
    private Header header = new Header();

    private Integer expiration = 3600;

    private String privateKey = "qxBEEQv7E8aviX1KUcdOiF5ve5COUPAr";

    private String type = "encrypted";

    @Getter
    @Setter
    private static class Header {
        private String name = "Authorization";
        private String prefix = "Bearer";
    }
}
