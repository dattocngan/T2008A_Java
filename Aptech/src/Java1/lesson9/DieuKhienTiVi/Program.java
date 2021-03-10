/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1.lesson9.DieuKhienTiVi;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Program {
    public static void main(String[] args) {
        int choose;
        cTivi tivi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lua chon phuong thuc khoi tao tivi:");
        System.out.println("1.Mac dinh");
        System.out.println("2.Tu chon kenh");
        choose = Integer.parseInt(scan.nextLine());
        if(choose == 1){
            tivi = new cTivi();
            System.out.println("Da khoi tao mac dinh!!");
        }else{
            System.out.println("Nhap so kenh muon them vao:");
            int select = Integer.parseInt(scan.nextLine());
            String[] list = new String[select];
            int count = 0;
            while(true){
                System.out.println("Nhap kenh:");
                String kenh = scan.nextLine();
                list[count++] = kenh;
                select--;
                if(select == 0) break;
            }
            tivi = new cTivi(list);
            System.out.println("Da khoi tao tu chon kenh!!");
        }
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    tivi.Switch();
                    break;
                case 2:
                    System.out.println("Nhap kenh:");
                    String kenh = scan.nextLine();
                    tivi.Switch(kenh);
                    break;
                case 3:
                    tivi.On();
                    break;
                case 4:
                    tivi.Off();
                    break;
                case 5:
                    tivi.nextChannel();
                    break;
                case 6:
                    tivi.previousChannel();
                    break;
                case 7:
                    tivi.Show();
                    break;
                case 8:
                    System.out.println("Ket thuc chuong trinh!!");
                    break;
                default:
                    System.out.println("Nhap sai!!");
                    break;
            }
        }while(choose != 8);
    }
    static void showMenu(){
        System.out.println("1.Chuyen trang thai");
        System.out.println("2.Chuyen trang thai kem theo kenh");
        System.out.println("3.Bat tivi");
        System.out.println("4.Tat tivi");
        System.out.println("5.Chuyen kenh tiep");
        System.out.println("6.Chuyen kenh truoc");
        System.out.println("7.Xem thong tin tivi");
        System.out.println("8.Ket thuc");
    }
}
