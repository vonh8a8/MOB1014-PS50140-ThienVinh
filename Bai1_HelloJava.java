/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.bai1_hellojava;
import java.util.Scanner;

/**
 *
 * @author Admin_Vinh
 */
public class Bai1_HelloJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        int namSinh;
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.printf("Chao %s. Nam nay %d tuoi.\n",hoTen,2026-namSinh);
    }
}
