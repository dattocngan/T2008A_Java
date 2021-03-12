/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.lesson2;

/**
 *
 * @author MyPC
 */
public class People {
    String name;
    int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getLine(){
        return name + "," + age + "\n";
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + '}';
    }
    
}
