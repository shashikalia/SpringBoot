package com.shashi.configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ContainerConfiguration implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9000);
        container.setSessionTimeout(5, TimeUnit.MINUTES);
    }

}
