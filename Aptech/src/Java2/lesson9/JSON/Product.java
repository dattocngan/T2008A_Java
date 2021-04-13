/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson9.JSON;

import com.google.gson.annotations.SerializedName;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Product {

    @SerializedName("title")
    String title;

    String thumbnail, description;
    float price;

    public Product() {
    }

    public Product(String title, String thumbnail, String description, float price) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
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

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("======NHAP THONG TIN SAN PHAM======");
        System.out.println("Nhap tieu de san pham:");
        title = scan.nextLine();
        System.out.println("Nhap thumbnail:");
        thumbnail = scan.nextLine();
        System.out.println("Nhap mo ta:");
        description = scan.nextLine();
        System.out.println("Nhap gia:");
        price = Float.parseFloat(scan.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" + "title=" + title + ", thumbnail=" + thumbnail + ", description=" + description + ", price=" + price + '}';
    }

}
