/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson9.JSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Main {

    static List<Product> dataList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    saveFile();
                    break;
                case 4:
                    readFile();
                    break;
                case 5:
                    readAPI();
                    break;
                case 6:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        } while (choose != 6);
    }

    static void showMenu() {
        System.out.println("1.Nhap thong tin san pham");
        System.out.println("2.Hien thi thong tin san pham");
        System.out.println("3.Luu vao file product.json");
        System.out.println("4.Doc tu file product.json");
        System.out.println("5.Thao tac API (fake)");
        System.out.println("6.Thoat");
        System.out.println("Chon:");
    }

    private static void input() {
        System.out.println("Nhap so luong san pham:");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.input();
            dataList.add(product);
        }
    }

    private static void display() {
        System.out.println("======THONG TIN SAN PHAM======");
        dataList.forEach((product) -> {
            System.out.println(product);
        });
    }

    private static void saveFile() {
        //Buoc 1: Convert dataList (Array) -> json string
        Gson gson = new Gson();
        String json = gson.toJson(dataList);

        //Save du lieu vao file product.json
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("product.json");
            byte[] b = json.getBytes();
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private static void readFile() {
        File file = new File("product.json");
        try {
            FileReader reader = new FileReader(file);
            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Product>>() {}.getType();
            dataList = gson.fromJson(reader, type);
            display();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static final String API_PRODUCT_LIST = "https://raw.githubusercontent.com/dattocngan/T2008A_Web/main/Back-end/product.json";
    private static void readAPI() {
        
    }
}
