/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam1_QuanLyMayTinh;

import java.util.Date;

/**
 *
 * @author MyPC
 */
public abstract class Device {
    int id;
    String name;
    String manu;
    Date importedDate;

    public Device() {
    }

    public Device(int id, String name, String manu, Date importedDate) {
        this.id = id;
        this.name = name;
        this.manu = manu;
        this.importedDate = importedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public Date getImportedDate() {
        return importedDate;
    }

    public void setImportedDate(Date importedDate) {
        this.importedDate = importedDate;
    }

    @Override
    public String toString() {
        return "Device{" + "id=" + id + ", name=" + name + ", manu=" + manu + ", importedDate=" + importedDate + '}';
    }
    
    
    
    abstract void input();
    abstract void display();
}
