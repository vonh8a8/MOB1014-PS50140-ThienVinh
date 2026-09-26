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
public class ChuyenDoi {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String chuoi="";
        int n,m;
        System.out.print("Nhap so he thap phan: ");
        n = s.nextInt();
        m=n;
        while(n>0){
            int t = n%2;
            chuoi = t+chuoi;
            n = n/2;
        }
        System.out.printf("So %d chuyen doi sang nhi phan la: %s", m, chuoi);
    }
}
