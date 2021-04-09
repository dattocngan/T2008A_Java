/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson8.PersonalAnalyse;

import java.util.ArrayList;

/**
 *
 * @author MyPC
 */
public class LearningEquipment {
    String laptop;
    ArrayList<String> bookList = new ArrayList<>();

    public LearningEquipment() {
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public ArrayList<String> getBookList() {
        return bookList;
    }

    public void setBookList(String book) {
        this.bookList.add(book);
    }

    @Override
    public String toString() {
        return "laptop=" + laptop + ", bookList=" + bookList;
    }
    
}
