
import java.util.*;
public class Product {

    int id;
    String name;
    String description;
    String category;
    String brand;
    double price;
    int amountStock;
    //public enum product {InStock, OutComing, OutofStock};

    public Product() {

    }

    public Product(int id, String name, String description, String category, String brand, double price, int amountStock) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.amountStock = amountStock;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountofStock() {
        return amountStock;
    }

    public String display() {
        return ("Id: " + id + " " + "Name: " + name + " " + "Description: " + description + " " + "category: " + category + " " + "Brand: " + brand + " " + "Price: " + price + " " + "Amount Stock: " + amountStock);

    }
}
