package com.intelliviz;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("In BeforeAll...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("In AfterAll...");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In BeforeEach...");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("In AfterEach...");
        greeting = null;
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld1("Ed"));
    }
}