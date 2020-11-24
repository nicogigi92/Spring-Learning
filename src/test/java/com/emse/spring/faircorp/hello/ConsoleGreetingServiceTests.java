package com.emse.spring.faircorp.hello;
import com.emse.spring.faircorp.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConsoleGreetingServiceTests implements GreetingServiceTest{
    @Override
    public void greet(String name) {
        System.out.println("Hello, "+name+"!");
    }
}


