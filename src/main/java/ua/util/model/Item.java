package ua.util.model;

import java.util.Objects;

public class Item extends BaseEntity {
    private String name;
    private double price;
    private int stock;
    private ItemStatus status;

    public Item(String name, double price, int stock) {
        super();
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price must be >= 0");
        this.price = price;
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock must be >= 0");
        this.stock = stock;
        this.status = stock > 0 ? ItemStatus.IN_STOCK : ItemStatus.OUT_OF_STOCK;
    }

    public ItemStatus getStatus() { return status; }

    @Override
    public String toString() {
        return "Item#" + id + " " + name + " | $" + price + " | stock: " + stock + " | status: " + status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
               Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name, price); }

    public static Item of(String name, double price, int stock) {
        return new Item(name, price, stock);
    }
}
