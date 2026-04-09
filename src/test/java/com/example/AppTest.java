package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testEvenOdd() {

        App obj = new App();

        assertEquals("Even", obj.checkEvenOdd(4));
    }
}