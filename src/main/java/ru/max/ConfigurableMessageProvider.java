package ru.max;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Serov Maxim
 */
@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private final String message;

    @Autowired
    public ConfigurableMessageProvider(@Value("Configurable Message") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
