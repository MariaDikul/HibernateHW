package ru.netology.hibernatehw;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineApp {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CommandLineApp.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
