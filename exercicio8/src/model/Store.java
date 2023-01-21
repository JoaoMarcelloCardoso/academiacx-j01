package model;

public class Store {
    String item;
    float price;

    public Store(String item, float price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Product: " + item + " | " +
                " Price: " + price;
    }
}
