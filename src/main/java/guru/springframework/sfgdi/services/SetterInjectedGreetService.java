package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
