package ru.netology;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @BeforeAll
    static void nameCompany(){
        TaxSystem taxSystem = new Income();
        Company company = new Company("Шевроле", taxSystem);
        company.shiftMoney(5000);
    }

    @org.junit.jupiter.api.Test
    void shiftMoney() {
        nameCompany();
        assertEquals(300,300);
    }

    @org.junit.jupiter.api.Test
    void payTaxes() {
       nameCompany();
    }
}