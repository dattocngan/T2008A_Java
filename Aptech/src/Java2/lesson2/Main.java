/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MyPC
 */

//Hoc thao tac File, Generics
public class Main {
    public static void main(String[] args) {
        //Khai bao 1 mang quan ly danh sach String
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Vi du 1");
        arr1.add("Vi du 2");
        arr1.add("Vi du 3");
        String s = arr1.get(1);
        System.out.println(arr1);
        
        //Khai bao 1 mang quan ly danh sach so nguyen
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(5);
        int t = arr2.get(0);
        System.out.println(arr2);
        
        //Ket luan nhu sau
        //1. ArrayList<String> & ArrayList<Integer> => Cung dang tro toi 1 class
        //2. add(String) & add(Integer) -> su dung 1 ham duy nhat -> ko phai overloading
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("name", 12);
        map.put("Age", 18);
        System.out.println(map);
        
        DataController<String> data = new DataController<>();
        data.add("ABC");
        data.add("CDE");
        System.out.println(data);
        
        DataController<People> people = new DataController<>();
        people.add(new People("A1", 18));
        people.add(new People("A2", 19));
        System.out.println(people);
        
        DataController<Student> student = new DataController<>();
        student.add(new Student(123456, "Tien Dat", 18));
        System.out.println(student);
    }
}
