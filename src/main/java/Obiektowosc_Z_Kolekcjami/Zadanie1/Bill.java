package Obiektowosc_Z_Kolekcjami.Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    List<Product> productList = new ArrayList();

    public Bill(List<Product> productList) {
        this.productList = productList;
    }

    public void printBill() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List getProductList() {
        return productList;
    }

    public double sumBillNetPrice() {
        double netSum = 0;
        for (Product product : productList) {
            netSum += product.getNetPrice();
        }
        return netSum;
    }

    public double sumBillGrossPrice() {
        double grossSum = 0;
        for (Product product : productList) {
            grossSum += product.countTheGrossPrice(product.getNetPrice());
        }
        return grossSum;
    }

    public double sumAmountOfTax() {
        return sumBillGrossPrice() - sumBillNetPrice();
    }
}
