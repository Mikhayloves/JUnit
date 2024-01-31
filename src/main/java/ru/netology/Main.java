package ru.netology;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        TaxSystem taxSystem = new Income();
        Company company = new Company("Шевроле", taxSystem);

        company.shiftMoney(5000);
        company.shiftMoney(1000);
        company.payTaxes();
    }
}
