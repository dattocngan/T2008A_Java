/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson10;

/**
 *
 * @author MyPC
 */
public class Product {
    String name, categoryName, description;
    float price;

    public Product() {
    }

    public Product(String name, String categoryName, String description, float price) {
        this.name = name;
        this.categoryName = categoryName;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", categoryName=" + categoryName + ", description=" + description + ", price=" + price + '}';
    }
    
    
}
