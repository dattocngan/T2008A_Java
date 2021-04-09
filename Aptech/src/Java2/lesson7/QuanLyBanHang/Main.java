/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson7.QuanLyBanHang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Category> categoryList = new ArrayList<>();
        List<Product> soldProductList = new ArrayList<>();
        List<Product> expiredProductList = new ArrayList<>();
        Date currentDate = new Date();
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    Category category = new Category();
                    category.input();
                    categoryList.add(category);
                    break;
                case 2:
                    Product product = new Product();
                    product.input();
                    categoryList.stream().filter((category1) -> (category1.getCategoryCode().equalsIgnoreCase(product.getCategoryCode()))).forEachOrdered((category1) -> {
                        category1.productList.add(product);
                    });
                    break;
                case 3:
                    System.out.println("Danh sach cac san pham da ban:");
                    int boughtCheck = 0;
                    for (Category category1 : categoryList) {
                        for(Product product1 : category1.productList){
                            if(product1.getExportDate() != null){
                                product1.display();
                                boughtCheck++;
                                soldProductList.add(product1);
                            }
                        }
                    }
                    if(boughtCheck == 0) System.out.println("Khong co san pham nao ca");
                    break;
                case 4:
                    System.out.println("Danh sach cac san pham con ton kho:");
                    int notBoughtCheck = 0;
                    for (Category category1 : categoryList) {
                        for(Product product1 : category1.productList){
                            if(product1.getExportDate() == null){
                                product1.display();
                                notBoughtCheck++;
                            }
                        }
                    }
                    if(notBoughtCheck == 0) System.out.println("Khong co san pham nao ca");
                    break;
                case 5:
                    System.out.println("Danh sach cac san pham qua han su dung:");
                    int expiredCheck = 0;
                    for (Category category1 : categoryList) {
                        for(Product product1 : category1.productList){
                            if(product1.getExpiredDate().before(currentDate)){
                                product1.display();
                                expiredCheck++;
                                expiredProductList.add(product1);
                            }
                        }
                    }
                    if(expiredCheck == 0) System.out.println("Khong co san pham nao ca");
                    break;
                case 6:
                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(currentDate);
                    c1.add(Calendar.DATE, 7);
                    Date curreDatePlus7 = c1.getTime();
                    System.out.println("Danh sach cac san pham sap het han su dung:");
                    int almostExpiredCheck = 0;
                    for (Category category1 : categoryList) {
                        for(Product product1 : category1.productList){
                            if((currentDate.before(product1.getExpiredDate()) && product1.getExpiredDate().before(curreDatePlus7)) ||
                                    product1.getExpiredDate().equals(currentDate) || product1.getExpiredDate().equals(curreDatePlus7) ){
                                product1.display();
                                almostExpiredCheck++;
                            }
                        }
                    }
                    if(almostExpiredCheck == 0) System.out.println("Khong co san pham nao ca");
                    break;
                case 7:
                    System.out.println("Nhap ten san pham can tim kiem:");
                    String search = scan.nextLine();
                    int count = 0;
                    for (Category category1 : categoryList) {
                        for(Product product1 : category1.productList){
                            if(product1.getProductName().equalsIgnoreCase(search)){
                                product1.display();
                                count++;
                            }
                        }
                    }
                    if(count == 0) System.out.println("Khong co san pham nao ca");
                    else System.out.println("So luong: " + count);
                    break;
                case 8:
                    FileOutputStream categoryFos = null;
                    FileOutputStream sellFos = null;
                    FileOutputStream expiredFos = null;
                    try {
                        categoryFos = new FileOutputStream("category.dat",true);
                        sellFos = new FileOutputStream("sell.dat",true);
                        expiredFos = new FileOutputStream("expire.dat",true);
                        for (Category category1 : categoryList) {
                            byte[] b1 = category1.getLine().getBytes();
                            categoryFos.write(b1);
                        }
                        for (Product product1 : soldProductList) {
                            byte[] b2 = product1.getLine().getBytes();
                            sellFos.write(b2);
                        }
                        for (Product product1 : expiredProductList) {
                            byte[] b3 = product1.getLine().getBytes();
                            sellFos.write(b3);
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        try {
                            if(categoryFos != null) categoryFos.close();
                            if(sellFos != null) sellFos.close();
                            if(expiredFos != null) expiredFos.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }while(choose != 10);
    }
    
    public static void showMenu(){
        System.out.println("1.Nhap thong tin danh muc");
        System.out.println("2.Nhap thong tin san pham");
        System.out.println("3.In ra danh sach cac san pham da ban");
        System.out.println("4.In ra danh sach san pham con ton kho");
        System.out.println("5.In ra danh sach san pham da qua han su dung");
        System.out.println("6.In ra danh sach san pham sap het han su dung");
        System.out.println("7.Tim kiem san pham theo ten");
        System.out.println("8.Luu vao file");
        System.out.println("9.Doc du lieu tu file");
        System.out.println("10.Exit");
    }
}
