package Obiektowosc_Z_Kolekcjami.Zadanie1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        List<Product> products = new ArrayList<>();
        Bill newBill = new Bill(products);


        Product pizza = new Product("pizza", 23.30, productTax.VAT8);
        Product hamburger = new Product("hamburger", 14.50, productTax.VAT8);
        Product hotDog = new Product("hot dog", 8.25, productTax.VAT8);
        Product cola = new Product("cola", 3.50, productTax.VAT23);
        Product juice = new Product("juice", 2.80, productTax.VAT23);
        Product salad = new Product("salad", 5.80, productTax.VAT5);

        newBill.addProduct(pizza);
        newBill.addProduct(hamburger);
        newBill.addProduct(cola);
        newBill.addProduct(juice);
        newBill.addProduct(salad);

        System.out.println(newBill.productList);

        System.out.println(df.format(newBill.sumBillNetPrice()));
        System.out.println(df.format(newBill.sumBillGrossPrice()));
        System.out.println(df.format(newBill.sumAmountOfTax()));

    }
}
