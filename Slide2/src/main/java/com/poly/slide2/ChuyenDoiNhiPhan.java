/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.slide2;
import java.util.Scanner;

/**
 *
 * @author Admin_Vinh
 */
public class ChuyenDoiNhiPhan {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String chuoi ="";
        int n,m;
        System.out.println("Nhap so he thap phan: ");
        n = c.nextInt();
        m=n;
        while (n>0)
        {
            int s = n%2;
            chuoi = s+chuoi;
            
            n=n/2;
        }
        System.out.printf("So %d he thap phap chuyen sang nhi phan la: %s",m,chuoi);
    }
}
