/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson6.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class CustomerRelationship {
    static HashMap<String,String> customerList = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer csm = new Customer();
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    Customer customer = new Customer();
                    System.out.println("Nhap ten:");
                    customer.name = scan.nextLine();
                    System.out.println("Nhap so dien thoai:");
                    customer.phoneNumber = scan.nextLine();
                    System.out.println("Nhap email:");
                    customer.email = scan.nextLine();
                    customer.add(customer.name, customer.phoneNumber);
                    break;
                case 2:
                    csm.search();
                    break;
                case 3:
                    csm.show();
                    break;
                case 4:
                    System.out.println("Tam biet");
                    break;
                default:
                    System.out.println("Loi");
                    break;
            }
        }while(choose !=4);
    }
    
    static void showMenu(){
        System.out.println("1.Add new customer");
        System.out.println("2.Find by name");
        System.out.println("3.Display all");
        System.out.println("4.Exit");
    }
}
