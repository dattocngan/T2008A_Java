/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java2.ExamAptech;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scan = new Scanner(System.in);
        int choose;
        do{
            showMenu();
            System.out.println("Select program:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    student.add();
                    break;
                case 2:
                    student.display();
                    break;
                case 3:
                    student.save();
                    System.out.println("Successfully saved!!");
                    break;
                case 4:
                    System.out.println("Goodbye!!");
                    break;
                default:
                    System.out.println("Wrong command!!");
                    break;
            }
        }while(choose != 4);
    }
    static void showMenu(){
        System.out.println("1.Add student records");
        System.out.println("2.Display student records");
        System.out.println("3.Save");
        System.out.println("4.Exit");
    }
}
