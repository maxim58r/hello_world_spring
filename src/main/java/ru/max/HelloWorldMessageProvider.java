package ru.max;

import org.springframework.stereotype.Component;

//@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    public String getMessage() {
        return "Hello World!!!";
    }
}
