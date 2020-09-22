package com.handson1.testsuite;
import org.junit.runner.*;
import static org.junit.Assert.*;

import com.handson1.assertMethodAndAnnotations.handson1.JunitTestEmployee;
import com.handson1.assertMethodAndAnnotations.handson2.JunitTestDemo2;
import com.handson1.junitWithEclipse.JunitTestDemo1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        JunitTestEmployee.class,
        JunitTestDemo2.class,
        JunitTestDemo1.class
})

public class TestSuit {
}
