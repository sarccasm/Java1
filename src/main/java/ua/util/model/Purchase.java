package ua.util.model;

import java.time.LocalDate;
import java.util.List;

public class Purchase {
    private Customer customer;
    private List<Item> items;
    private LocalDate purchaseDate;
    private PurchaseStatus status;

    public Purchase(Customer customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
        this.purchaseDate = LocalDate.now();
        this.status = PurchaseStatus.PENDING;
    }

    public void complete() { this.status = PurchaseStatus.COMPLETED; }
    public void returnPurchase() { this.status = PurchaseStatus.RETURNED; }

    public LocalDate getPurchaseDate() { return purchaseDate; }

    @Override
    public String toString() {
        return "Purchase{" + "customer=" + customer + ", items=" + items.size() + ", date=" + purchaseDate + ", status=" + status + "}";
    }
}
