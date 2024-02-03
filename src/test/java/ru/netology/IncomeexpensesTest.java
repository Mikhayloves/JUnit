package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeexpensesTest {
    Incomeexpenses incomeexpenses = new Incomeexpenses();
    @org.junit.jupiter.api.Test
    void calcTaxFor() {
        // given:
        int debit = 2500;
        int credit = 2500;
        // when:
        int result = incomeexpenses.calcTaxFor(debit,credit);
        // then:
        assertEquals(15,result);

    }
}