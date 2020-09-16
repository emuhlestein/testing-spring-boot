package com.intelliviz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Map;

public class AnnotationMocksTest {

    @Mock
    Map<String, Object> mapMock;

    @Mock
    List<String> listMock;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMock() {
        mapMock.put("keyvalue", "foo");
        listMock.add("one");
    }
}
