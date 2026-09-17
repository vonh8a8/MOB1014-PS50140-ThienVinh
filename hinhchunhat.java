/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.bai1_hellojava;
import java.util.Scanner;

/**
 *
 * @author Admin_Vinh
 */
public class hinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long d,r,s,p;
        System.out.println("Nhap chieu dai: ");
        d = sc.nextLong();
        System.out.println("Nhap chieu rong: ");
        r = sc.nextLong();
        s = d*r;
        p = (d+r)*2;
        System.out.printf("Chu vi: %d\nDien tich: %d\n",p,s);
    }
}
