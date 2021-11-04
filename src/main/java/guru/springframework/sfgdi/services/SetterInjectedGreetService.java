package guru.springframework.sfgdi.services;

public class SetterInjectedGreetService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World -- Setter";
    }
}
