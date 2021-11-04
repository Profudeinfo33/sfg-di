package guru.springframework.sfgdi.services;

public class ConstructorGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello World -- Constructor";
    }
}
