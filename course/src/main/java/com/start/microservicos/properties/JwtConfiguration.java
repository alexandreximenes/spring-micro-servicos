package com.start.microservicos.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "jwt.config")
public class JwtConfiguration {
    private String loginUrl = "/login/**";
    private int expiration = 3600;
    private String secret = "5Ps9q3y1yX2fjWblUSUQ8cJrekVdLHx5";
    private String type = "encrypted";
    @NestedConfigurationProperty
    private Header header = new Header();

    @Getter
    @Setter
    public static class Header{
        private String name = "Authorization";
        private String prefix = "Bearer ";
    }
}
