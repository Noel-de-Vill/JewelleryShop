package product;

import java.io.Serializable;

public class Product implements Serializable{

    String name;
    String type;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Product(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

}
