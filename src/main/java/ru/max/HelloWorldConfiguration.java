package ru.max;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.ConstructorProperties;

/**
 * @author Serov Maxim
 */
@ComponentScan(basePackages = "ru.max")
@Configuration
public class HelloWorldConfiguration {
//    @Bean
//    public MessageProvider provider() {
//        return new HelloWorldMessageProvider();
//    }

//    @Bean
//    public MessageRenderer renderer() {
//        MessageRenderer renderer = new StandardOutMessageRenderer();
//        renderer.setMessageProvider(provider());
//        return renderer;
//    }
}
