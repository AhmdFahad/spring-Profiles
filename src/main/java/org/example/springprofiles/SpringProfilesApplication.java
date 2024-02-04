package org.example.springprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringProfilesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringProfilesApplication.class, args);
    }
    @Autowired
    Test test;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(test.text());
    }
}

@Component
class Test{
    @Value("${test.text}")
    String t;
    @Value("${test.ver}")
    String ss;

    @Bean
    public String text(){
        System.out.println(ss);
        return t;
    }
}