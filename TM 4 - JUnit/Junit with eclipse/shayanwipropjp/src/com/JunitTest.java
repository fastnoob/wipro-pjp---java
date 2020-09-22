package com;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitTest {

    @Test
    void testStringConcat() {
        Demo1 myDemo = new Demo1();
        assertEquals("Success", "ShayanSaha", myDemo.stringConcat("Shayan", "Saha"));
    }

}

