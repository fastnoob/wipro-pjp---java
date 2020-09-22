package com.handson1.junitWithEclipse;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class JunitTestDemo1 {

    @Test
    public void testStringConcat() {
        Demo1 myDemo = new Demo1();
        assertEquals("ShayanSaha", myDemo.stringConcat("Shayan", "Saha"));
    }

}

