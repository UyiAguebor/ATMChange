package com.sparta.ua;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest {
    String expected1 = "Amount of £50 notes: 9\n" +
            "Amount of £20 notes: 20\n" +
            "Amount of £10 notes: 50\n" +
            "Amount of £5 notes: 99\n" +
            "Amount of £2 notes: 249\n" +
            "Amount of £1 notes: 500";

    String expected2 = "Amount of £50 notes: 9\n" +
            "Amount of £20 notes: 20\n" +
            "Amount of £10 notes: 50\n" +
            "Amount of £5 notes: 100\n" +
            "Amount of £2 notes: 250\n" +
            "Amount of £1 notes: 500";

    String expected3 = "Amount of £50 notes: 7\n" +
            "Amount of £20 notes: 20\n" +
            "Amount of £10 notes: 50\n" +
            "Amount of £5 notes: 99\n" +
            "Amount of £2 notes: 248\n" +
            "Amount of £1 notes: 500";


    @Test
    @DisplayName("Test values")
    public void Testing150() {
        Assertions.assertEquals(expected1,ATM.getChange(157));
    }


    @Test
    @DisplayName("Test values")
    public void Testing157() {
        Assertions.assertEquals(expected2,ATM.getChange(150));
    }
    @Test
    @DisplayName("Test values")
    public void Testing259() {
        Assertions.assertEquals(expected3,ATM.getChange(259));
    }

    }
