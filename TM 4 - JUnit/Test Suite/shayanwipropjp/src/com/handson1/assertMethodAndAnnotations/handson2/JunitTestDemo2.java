package com.handson1.assertMethodAndAnnotations.handson2;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitTestDemo2 {
    Demo2 demotest = new Demo2();
    @Test
    public void junitTestPalindrome(){
        assertTrue(demotest.palindromeCheck("madam"));
        assertFalse(demotest.palindromeCheck("tom"));
    }
}
