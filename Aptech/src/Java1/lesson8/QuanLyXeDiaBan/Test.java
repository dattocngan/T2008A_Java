/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java1.lesson8.QuanLyXeDiaBan;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        XeMayHaNoi haNoi = new XeMayHaNoi();
        XeMayHoaBinh hoaBinh = new XeMayHoaBinh();
        int choose, chon;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    hoaBinh.nhap();
                    break;
                case 2:
                    haNoi.nhap();
                    break;
                case 3:
                    System.out.println("1.Danh sach xe Hoa Binh");
                    System.out.println("2.Danh sach xe Ha Noi");
                    System.out.println("Lua chon khu vuc:");
                    chon = Integer.parseInt(scan.nextLine());;
                    if(chon == 1){
                        hoaBinh.sapXep();
                    }else{
                        haNoi.sapXep();
                    }
                    break;
                case 4:
                    System.out.println("1.Danh sach xe Hoa Binh");
                    System.out.println("2.Danh sach xe Ha Noi");
                    System.out.println("Lua chon khu vuc:");
                    chon = Integer.parseInt(scan.nextLine());;
                    if(chon == 1){
                        hoaBinh.search();
                    }else{
                        haNoi.search();
                    }
                    break;
                case 5:
                    System.out.println("Danh sach xe Hoa Binh:");
                    hoaBinh.hoaBinhList.forEach((xeMay) -> {
                        xeMay.hienthi();
                    });
                    System.out.println("Danh sach xe Ha Noi:");
                    haNoi.haNoiList.forEach((xeMay) -> {
                        xeMay.hienthi();
                    });
                    break;
                case 6:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Nhap sai chuong trinh!!");
                    break;
            }
        }while(choose != 6);
    }
    
    static void showMenu(){
        System.out.println("1. Nh???p th??ng tin cho n xe m??y t???i t???nh H??a B??nh.");
        System.out.println("2. Nh???p th??ng tin cho n xe m??y t???i t???nh H?? N???i.");
        System.out.println("3. S???p x???p danh s??ch t??ng theo bi???n s??? xe.");
        System.out.println("4. T??m ki???m th??ng tin xe theo bi???n s??? xe.");
        System.out.println("5. Th???ng k?? s??? l?????ng xe ??ang qu???n l??.");
        System.out.println("6. Tho??t");
    }
}
