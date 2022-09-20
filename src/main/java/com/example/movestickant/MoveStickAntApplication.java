package com.example.movestickant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class MoveStickAntApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoveStickAntApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping(value = "/pushWeb")
    public Map<String, Object> pushVideoListToWeb(String message) {
        int n=10;
        Map<String, Object> result = new HashMap<String, Object>();

        return result;
    }
}
