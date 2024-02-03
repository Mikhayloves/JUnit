package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {
        Income income = new Income();
    @org.junit.jupiter.api.Test
    void calcTaxFor() {
        TaxSystem taxSystem = new Income();
        Company company = new Company("Шевроле", taxSystem);
        // given:
        int debit = 500;
        int credit = 500;
        // when:
        int result = income.calcTaxFor(debit,credit);

        // then:
        assertEquals(30,result);
    }
}