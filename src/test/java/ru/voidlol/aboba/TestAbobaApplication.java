package ru.voidlol.aboba;

import org.springframework.boot.SpringApplication;

public class TestAbobaApplication {

    public static void main(String[] args) {
        SpringApplication.from(AbobaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
