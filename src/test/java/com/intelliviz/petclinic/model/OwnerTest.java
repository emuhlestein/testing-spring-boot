package com.intelliviz.petclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Ed", "Muhlestein");
        owner.setCity("Kaysville");
        owner.setTelephone("123123123");

        assertAll("Properties Test",
                () -> assertAll("Persons Properties",
                        () -> assertEquals("Ed", owner.getFirstName()),
                        () -> assertEquals("Muhlestein", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Kaysville2", owner.getCity()),
                        () -> assertEquals("123123123", owner.getTelephone())
                ));
    }
}