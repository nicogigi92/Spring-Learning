package com.emse.spring.faircorp.hello;
import com.emse.spring.faircorp.ConsoleGreetingService;
import com.emse.spring.faircorp.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.ArrayList;


@Service
public class DummyUserService implements UserService {
    @Bean
    public void greetAll() {
        GreetingService greetingService = new ConsoleGreetingService();
        ArrayList<String> noms = new ArrayList<String>();
        noms.add("Elodie");
        noms.add("Charles");
        greetingService.greet(noms.get(0));
        greetingService.greet(noms.get(1));
    }
}
