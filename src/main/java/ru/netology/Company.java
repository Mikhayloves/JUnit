package ru.netology;

public class Company {
    public String title;
    public int debit;
    public int credit;
    public TaxSystem taxSystem;


    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else {
            credit += Math.abs(amount);
        }
    }
    public void payTaxes() {
        int result = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере:" + result + " руб.");
    }
}
