/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson6.Customer;

import static Java2.lesson6.Customer.CustomerRelationship.customerList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Customer {
    String name, phoneNumber, email;

    public Customer() {
    }

    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void add(String a, String b){
        CustomerRelationship.customerList.put(a, b);
    }
    public void search(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String nameSearch = scan.nextLine();
        int check = 0;
        for (Map.Entry<String, String> entry : customerList.entrySet()) {
            if(entry.getKey().equalsIgnoreCase(nameSearch)){
                check++;
                String a = "Name";
                String b = "Phone number";
                String c = "CRM";
                System.out.format("%15s",c);
                System.out.println("");
                System.out.format("%-20s%-20s",a,b);
                System.out.println("");
                System.out.format("%-20s%-20s",entry.getKey(),entry.getValue());
                System.out.println("");
                break;
            }
        }
        if(check == 0) System.out.println("Khong tim thay nhan vien nao");
    }
    public void show(){
        String a = "Name";
        String b = "Phone number";
        String c = "CRM";
        System.out.format("%15s",c);
        System.out.println("");
        System.out.format("%-20s%-20s",a,b);
        System.out.println("");
        customerList.entrySet().stream().map((entry) -> {
            System.out.format("%-20s%-20s",entry.getKey(),entry.getValue());
            return entry;
        }).forEachOrdered((_item) -> {
            System.out.println("");
        });
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
    
}
