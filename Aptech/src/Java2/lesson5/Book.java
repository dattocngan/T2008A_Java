/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson5;

/**
 *
 * @author MyPC
 */
public class Book {
    String title, manu, author, publishDate;
    float price;
    int id;

    public Book() {
    }

    public Book(String title, String manu, String author, String publishDate, float price) {
        this.title = title;
        this.manu = manu;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
    }

    public Book(int id, String title, float price, String manu, String author, String publishDate) {
        this.title = title;
        this.manu = manu;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
        this.id = id;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", manu=" + manu + ", author=" + author + ", publishDate=" + publishDate + ", price=" + price + '}';
    }
    
}
