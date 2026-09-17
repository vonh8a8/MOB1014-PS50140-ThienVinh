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
public class hinhtron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        double r,cv,dt;
        System.out.print("Ban kinh hinh tron: ");
        r = sc.nextDouble();
        cv = r*2*PI;
        dt = r*r*PI;
        System.out.printf("Duong trong co ban kinh: %.2f\nChu vi: %.2f\nDien tich: %.2f",r,cv,dt);
    }
}
