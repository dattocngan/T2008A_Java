/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson7.QuanLyBanHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Category {
    String categoryCode, categoryName;
    List<Product> productList = new ArrayList<>();
    public Category() {
    }

    public Category(String categoryCode, String categoryName) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma danh muc:");
        categoryCode = scan.nextLine();
        System.out.println("Ten danh muc:");
        categoryName = scan.nextLine();
    }
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Category{" + "categoryCode=" + categoryCode + ", categoryName=" + categoryName + '}';
    }
    public String getLine(){
        return categoryCode + "," + categoryName + "\n";
    }
}
