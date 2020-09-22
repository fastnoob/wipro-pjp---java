package com.handson1;

import java.util.ArrayList;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class JunitTestEmployee {
    Employee employee = new Employee();
    ArrayList<String> list = new ArrayList<>();
    {
        list.add("Shayan");
        list.add("Irin");
        list.add("Ricky");
    }
    @Test
    void testFindName() {
        System.out.println(list);
        assertEquals("FOUND", employee.findName(list, "Shayan"));
    }
}