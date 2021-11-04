package guru.springframework.sfgdi.services;


public class PrimaryGreteingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
