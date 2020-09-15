package com.intelliviz.petclinic.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1l, "Ed", "Muhlestein");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Ed", person.getFirstName()),
                () -> assertEquals("Muhlestein", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsg() {
        // given
        Person person = new Person(1l, "Ed", "Muhlestein");

        // then
        assertAll("Test Props Set",
                () -> assertEquals("Ed", person.getFirstName(),  "First Name Failed"),
                () -> assertEquals("Muhlestein", person.getLastName(), "Last Name Failed"));
    }
}