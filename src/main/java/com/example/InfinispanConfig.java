package com.example;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.ConfigurationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfinispanConfig {

    @Bean
    public RemoteCacheManager remoteCacheManager() {
        ConfigurationBuilder builder = new ConfigurationBuilder();

        builder.addServer()
                .host("localhost")
                .port(11222)
                .security()
                .authentication()
                .username("admin")
                .password("password")
                .realm("default")
                .saslMechanism("DIGEST-MD5");

        return new RemoteCacheManager(builder.build());
    }

}