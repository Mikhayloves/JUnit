package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxSystemTest {
        TaxSystem taxSystem = new TaxSystem();
    @org.junit.jupiter.api.Test
    void calcTaxFor() {
        // given:
        int a;
        int debit = 300;
        int credit = 200;
        // when:
        int result = taxSystem.calcTaxFor(debit,credit);
        // then:
        assertEquals(0,result);

    }
}