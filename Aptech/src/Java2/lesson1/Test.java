/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Object> maps = new HashMap<>();
        maps.put("Name", "Nguyen Tien Dat");
        maps.put("Tuoi", 18);
        System.out.println(maps);
        System.out.println("Ten: " + maps.get("Name"));
    }
}
