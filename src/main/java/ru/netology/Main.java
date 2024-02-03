package ru.netology;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        TaxSystem taxSystem = new Income();
        Company company = new Company("Шевроле", taxSystem);
        company.shiftMoney(1000);
        company.payTaxes();

        TaxSystem taxSystem1 = new Incomeexpenses();
        Company company1 = new Company("Вольво", taxSystem1);

        company1.shiftMoney(1000);
        company1.payTaxes();
    }
}
