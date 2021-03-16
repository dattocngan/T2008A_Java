/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson3.QuanLiSachBangFile;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Book implements Serializable{
    String bookName, authorName;
    int price;
    String datePublishing;
    String manu;

    public Book() {
    }

    public Book(String bookName, String authorName, int price, String datePublishing, String manu) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
        this.datePublishing = datePublishing;
        this.manu = manu;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDatePublishing() {
        return datePublishing;
    }

    public void setDatePublishing(String datePublishing) {
        this.datePublishing = datePublishing;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten sach:");
        bookName = scan.nextLine();
        System.out.println("Nhap ten tac gia:");
        authorName = scan.nextLine();
        System.out.println("Gia ban:");
        price = Integer.parseInt(scan.nextLine());
        System.out.println("Ngay xuat ban:");
        datePublishing = scan.nextLine();
        System.out.println("Nha san xuat:");
        manu = scan.nextLine();
    }
    
    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + ", datePublishing=" + datePublishing + ", manu=" + manu + '}';
    }
    
    public String getLine(){
        return bookName + ", " + authorName + ", " + price + ", " + datePublishing + ", " + manu + "\n";
    }
}
