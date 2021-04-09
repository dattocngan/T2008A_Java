/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson7.QuanLyBanHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Product extends Category{
    String productCode, productName;
    float price;
    Date importDate, exportDate, expiredDate;
    String productDescription;

    public Product() {
    }

    public Product(String productCode, String productName, float price, Date importDate, Date exportDate, Date expiredDate, String productDescription, String categoryCode) {
        this.categoryCode = categoryCode;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.importDate = importDate;
        this.exportDate = exportDate;
        this.expiredDate = expiredDate;
        this.productDescription = productDescription;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public Date getExportDate() {
        return exportDate;
    }

    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String getCategoryCode() {
        return categoryCode;
    }

    @Override
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
    String importString, exportString, expiredString;
    @Override
    public void input(){
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhap ma san pham:");
        productCode = scan.nextLine();
        System.out.println("Nhap ma danh muc:");
        categoryCode = scan.nextLine();
        System.out.println("Nhap ten san pham:");
        productName = scan.nextLine();
        System.out.println("Nhap gia ban:");
        price = Float.parseFloat(scan.nextLine());
        System.out.println("Ngay nhap:");
        try {
            importDate = format.parse(importString = scan.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ngay ban:");
        try {
            exportDate = format.parse(exportString = scan.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Han su dung:");
        try {
            expiredDate = format.parse(expiredString = scan.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Mo ta san pham:");
        productDescription = scan.nextLine();
    }
    @Override
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Product{" + "productCode=" + productCode + ", categoryCode=" + categoryCode + ", productName=" + productName + ", price=" + price + ", importDate=" + importDate + ", exportDate=" + exportDate + ", expiredDate=" + expiredDate + ", productDescription=" + productDescription + '}';
    }
    public String getLine(){
        return productCode + "," + categoryCode + "," + productName + "," + price + "," + productCode + "," + importString + "," + exportString + "," + expiredString + "," + productDescription + "\n";
    }
}
