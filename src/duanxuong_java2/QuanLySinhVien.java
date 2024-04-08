/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanxuong_java2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySinhVien {
    ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
    Scanner s = new Scanner(System.in);
    public void nhapDs(){
        Scanner sc = new Scanner(System.in);
        int maNgannh;
        String maSinhVien;
        String tenSinhVien;
        do {            
            System.out.println("===>Nhap vao danh sach sinh vien<===");
            System.out.println("Nhap ma sinh vien:");
            maSinhVien = sc.nextLine();
            System.out.println("Nhap ten sinh vien:");
            tenSinhVien = sc.nextLine();
            System.out.println("Nhap vao nghanh cua sinh vien do: "); 
            do {  
                System.out.println("Moi ban chon|1.CNTT|2.Marketing|3.DuLich|4.QLKS");
                maNgannh = sc.nextInt();
            } while (maNgannh < 1 || maNgannh > 4);
            switch(maNgannh){
                case 1:
                    System.out.println("Sinh vien CNTT");
                    System.out.println("Moi ban nhap diem java");
                    double diemJava = sc.nextDouble();
                    System.out.println("Nhap diem html");
                    double diemHTML = sc.nextDouble();
                    System.out.println("Nhap diem css");
                    double diemCSS = sc.nextDouble();
                    SinhVien sv1 = new SinhVienCNTT(maNgannh,maSinhVien,tenSinhVien,diemJava,diemHTML,diemCSS);
                    ds.add(sv1);
                    break;
                case 2:
                    System.out.println("Sinh vien Marketing");
                    System.out.println("Nhap diem sale");
                    double diemSale = sc.nextDouble();
                    System.out.println("Nhap diem doi dap");
                    double diemDoiDap = sc.nextDouble();
                    SinhVien sv2 = new SinhVienMar(maNgannh,maSinhVien,tenSinhVien,diemSale,diemDoiDap);
                    ds.add(sv2);
                    break;
                case 3:
                    System.out.println("Sinh vien Du Lich");
                    System.out.println("Nhap diem cham");
                    double diemCham = sc.nextDouble();
                    System.out.println("Nhap diem giao tiep");
                    double diemGiaoTiep = sc.nextDouble();
                    SinhVien sv3 = new SinhVienDuLich(maNgannh,maSinhVien,tenSinhVien,diemCham,diemGiaoTiep);
                    ds.add(sv3);
                    break;
                case 4:
                    System.out.println("Sinh vien quan ly khach san");
                    System.out.println("Nhap diem quan ly");
                    double diemQuanLy = sc.nextDouble();
                    System.out.println("Nhap diem nen tang");
                    double diemNenTang = sc.nextDouble();
                    SinhVien sv4 = new SinhVienQLKS(maNgannh,maSinhVien,tenSinhVien,diemQuanLy,diemNenTang);
                    ds.add(sv4);
                    break;
                default:
                    System.out.println(".......");
                    break;
            }
            System.out.println("Ban co muon nhap tiep khong|1.Co|2.Khong");
            sc.nextLine();
            if(sc.nextLine().equals("2")){
                System.out.println("Da nhap xong!!!!");
                break;
            }else{
                System.out.println("Moi ban nhap tiep.......");
            }
        } while (true);
    }
    public void xuatDs(){
        System.out.println("<---------Danh sach Sinh Vien--------->");
        System.out.println("Ma Nghanh\t\t\tMa Sinh Vien\t\t\tTen Sinh Vien\t\t\tDiem Trung Binh\t\t\tHoc Luc");
        for(SinhVien list : ds){
            list.xuatThongTin();
        }
    }
    public void timSinhVienTheoMa(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien muon tim: ");
        String ma = s.nextLine();
        System.out.println("------------------Thong tin sinh cien muon tim--------------------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","maNganh", "maSinhVien", "tenSinhVien","DiemTrungbinh", "hocLuc");
        for (SinhVien list : ds) {
            ds.indexOf(list);
            if(list.getMaSinhVien().equalsIgnoreCase(ma)){
                list.xuatThongTin();
            }
        }
    }
    
    public void xoaSinhVienTheoMa(){
        System.out.println("Nhap ma sinh vien muon xoa: ");
        String ma = s.nextLine();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","maNganh", "maSinhVien", "tenSinhVien","DiemTrungbinh", "hocLuc");
        for (SinhVien list : ds) {
            if (ma.equalsIgnoreCase(list.getMaSinhVien())){
                ds.remove(list);
                break;
            }
        }
    }
    public void xuat3SvDiemCaoNhat(){
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.setDiemTrungBinh(), o2.setDiemTrungBinh());
            }
        });
        Collections.reverse(ds);
        int i = 0;
        for(SinhVien list : ds){
            System.out.println("Ma sinh vien:" + list.getMaSinhVien()+"|\t\t|Ten sinh vien:" +list.getTenSinhVien()+"|\t\t|Diem trung binh:"+list.setDiemTrungBinh()+"|\t\t|Hoc Luc:" + list.setHocLuc());
            i++;
            if(i==3){
                break;
            }
        }
    }
    public void timSinhVienTheoDiem(){
        System.out.println("--Nhap vao khoang diem ban muon tim--");
        System.out.println("Nhap vao min diem: ");
        double min = s.nextDouble();
        System.out.println("Nhap vao max diem: ");
        double max = s.nextDouble();
        System.out.println("---Danh sach sinh vien co muc diem ban muon tim----");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","maNganh", "maSinhVien", "tenSinhVien","DiemTrungbinh", "hocLuc");
        for (SinhVien list : ds) {
            if (list.setDiemTrungBinh()>=min && list.setDiemTrungBinh() <= max){
                list.xuatThongTin();
            }
        }
    }
    
    public void sapXepsvTheoHoTen(){
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTenSinhVien().compareTo(o2.getTenSinhVien());
            }
        };
        Collections.sort(ds,comp);
        xuatDs();
    }
    
    public void SapXepsvTheoMa(){
        Comparator<SinhVien> comp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o2.getMaSinhVien().compareTo(o1.getMaSinhVien());
            }
        };
        Collections.sort(ds,comp);
        xuatDs();
    }
    
    public void xuat3SinhVienCoMaLonNhat(){
        SapXepsvTheoMa();
        System.out.println("---- Nhan vien co ma ma so lon nhat----");
         System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","maNganh", "maSinhVien", "tenSinhVien","DiemTrungbinh", "hocLuc");
         if(ds.size() < 3){
             for (int i = 0; i < ds.size(); i++) {
                 ds.get(i).xuatThongTin();
             }
         }else{
             for (int i = 0; i < 3; i++) {
                 ds.get(i).xuatThongTin();
             }
         }
    }
      public void xuat3SvDiemThapNhat(){
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.setDiemTrungBinh(), o2.setDiemTrungBinh());
            }            
        });
        int i = 0;
        for(SinhVien list : ds){
            System.out.println("Ma sinh vien:" + list.getMaSinhVien()+"|\t\t|Ten sinh vien:" +list.getTenSinhVien()+"|\t\t|Diem trung binh:"+list.setDiemTrungBinh()+"|\t\t|Hoc Luc:" + list.setHocLuc());            
            i++;
            if(i==3){
                break;
            }
        }
    }
}
