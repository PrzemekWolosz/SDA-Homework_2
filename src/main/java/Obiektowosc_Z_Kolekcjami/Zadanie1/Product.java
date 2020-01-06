package Obiektowosc_Z_Kolekcjami.Zadanie1;

import java.text.DecimalFormat;

public class Product {

    private String name;
    private double netPrice;
    private double amountOfTax;
    private productTax tax;

    DecimalFormat df = new DecimalFormat("0.00");

    public Product(String name, double netPrice, productTax tax) {
        this.name = name;
        this.netPrice = netPrice;
        this.tax = tax;
    }

    protected double countTheGrossPrice(double netPrice) {
        return netPrice * tax.getTaxValue() + netPrice;
    }

    @Override
    public String toString() {
        return "\n Product{" +
                "name='" + name + '\'' +
                ", netPrice=" + netPrice +
                ", amountOfTax=" + df.format(countAmountOfTax(netPrice)) +
                ", tax=" + tax +
                '}';
    }

    private double countAmountOfTax(double netPrice) {
        return countTheGrossPrice(netPrice) - netPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public double getAmountOfTax() {
        return amountOfTax;
    }

    public void setAmountOfTax(double amountOfTax) {
        this.amountOfTax = amountOfTax;
    }
}
