/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.slide3;

/**
 *
 * @author Admin_Vinh
 */
public class Slide3 {

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 1;
        try {
            System.out.println(a[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
