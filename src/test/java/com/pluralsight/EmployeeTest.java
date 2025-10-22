package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchedIn_Time_Check() {
        //

        Employee testemployee = new Employee(12,"Matt","sales",0.0,0.0,0.0,0.0);

        testemployee.punchedIn(9.0);
        testemployee.punchOut(14.0);


     assertEquals(8.0,testemployee.getRegularHours(),0.001);



    }










    }

