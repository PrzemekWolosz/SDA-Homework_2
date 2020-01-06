package Obiektowosc_Z_Kolekcjami.Zadanie1;

public enum productTax {
    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0.0);

    private double taxValue;

    productTax(double taxValue) {
        this.taxValue = taxValue;
    }

    public double getTaxValue() {
        return taxValue;
    }
}
