package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
