package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {
        Income income = new Income();
    @org.junit.jupiter.api.Test
    void calcTaxFor() {
        // given:
        int debit = 300;
        int credit = 200;
        // when:
        int result = income.calcTaxFor(debit,credit);

        // then:
        assertEquals(18,result);
    }
}