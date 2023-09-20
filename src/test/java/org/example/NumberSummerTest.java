package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSummerTest {

    @Test
    public void testSum() {
        NumberSummer numberSummer = new NumberSummer();
        int sum = numberSummer.sum(1, 2);
        assertEquals(3, sum);
    }

}
