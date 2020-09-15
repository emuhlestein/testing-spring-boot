package com.intelliviz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld1("Ed"));
    }
}