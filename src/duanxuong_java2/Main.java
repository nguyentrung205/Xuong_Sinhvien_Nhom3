/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duanxuong_java2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien ql = new QuanLySinhVien();
        int chon;
        do {            
            System.out.println("----------------------Menu--------------------+");
            System.out.println("1.Nhap danh sach                              +");
            System.out.println("2.Xuat danh sach                              +");
            System.out.println("3.Tim sinh vien theo ma                       +");
            System.out.println("4.Xoa sinh vien theo ma                       +");
            System.out.println("5.Xuat 3 sinh vien diem cao nhat              +");
            System.out.println("6.Tim sinh vien theo khoang diem              +");
            System.out.println("7.Sap xep sinh vien theo ho ten               +");
            System.out.println("8.Sap xep sinh vien theo ma                   +");
            System.out.println("9.Xuat 3 Sinh vien co ma so lon nhat          +");
            System.out.println("10.Xoa tat ca sinh vien                       +");
            System.out.println("11. Thoat menu                                +");
            System.out.println("--------------------------------------------- +");
            System.out.println("Moi ban chon chuc nang");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    ql.nhapDs();
                    break;
                case 2:
                    ql.xuatDs();
                    break;
                case 3:
                    ql.timSinhVienTheoMa();
                    break;
                case 4:
                    ql.xoaSinhVienTheoMa();
                    break;
                case 5:
                    ql.xuat3SvDiemCaoNhat();
                    break;
                case 6: 
                    ql.timSinhVienTheoDiem();
                    break;
                case 7:
                    ql.sapXepsvTheoHoTen();
                    break;
                case 8:
                    ql.SapXepsvTheoMa();
                    break;
                case 9:
                    ql.xuat3SinhVienCoMaLonNhat();
                    break;
                case 10:
                    ql.xuat3SvDiemThapNhat();
                    break;
                case 11:
                    System.out.println("Da thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Moi ban chon lai chuc nang....");
                    break;
            }
        } while (true);
    }
    
}
