package ua.util;

import ua.util.model.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item i1 = Item.of("Laptop", 1200, 5);
        Item i2 = Item.of("Phone", 600, 0);
        Category c1 = new Category("Electronics", "Devices and gadgets");

        Customer cust = new Customer("John", "Doe", "john@example.com");
        Supplier supp = new Supplier("BestSupplier", "contact@best.com");

        Purchase purchase = new Purchase(cust, List.of(i1, i2));
        purchase.complete();

        boolean directEmailCheck = ValidationHelper.isValidEmail(cust.email());

        long idItem1 = ModelIntrospector.peekId(i1);
        long idCat1  = ModelIntrospector.peekId(c1);

        System.out.println(i1);
        System.out.println(c1);
        System.out.println(cust);
        System.out.println(supp);
        System.out.println(purchase);
        System.out.println("Email valid via Utils?  " + Utils.checkEmail(cust.email()));
        System.out.println("Email valid directly?   " + directEmailCheck);
        System.out.println("Item id via protected access: " + idItem1);
        System.out.println("Category id via protected access: " + idCat1);

        System.out.println("Email valid (bad): " + Utils.checkEmail("johnexample.com"));

        try {
            i1.setPrice(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Setter validation failed as expected: " + ex.getMessage());
        }

        try {
            Item bad = Item.of("", -5, -1);
            System.out.println(bad);
        } catch (IllegalArgumentException ex) {
            System.out.println("Validation failed as expected: " + ex.getMessage());
        }
    }
}
