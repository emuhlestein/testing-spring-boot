package com.intelliviz;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InLineMockTest {
    @Test
    void testInLineMock() {
        Map mapMock = Mockito.mock(Map.class);
        assertEquals(mapMock.size(), 0);
    }

}
