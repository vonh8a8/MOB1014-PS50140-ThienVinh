/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.slide2;
import java.util.Scanner;
/**
 *
 * @author Admin_Vinh
 */
public class Slide2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Class1 class1 = new Class1();
        class1.so =5;
        class1.xuat();
        
        Class2.so=10;
        Class2.xuat();
//        double diemTB =4.5;
//        if(diemTB >=5){
//            System.out.println("Dau\n");
//        }else{
//            System.out.println("Rot\n");
//        }
        int tien;
        
        String chuoi="", them="";
        System.out.println("Nhap so tien: ");
        tien = sc.nextInt();
        int so = tien;
        int index =0;
        
        while (tien > 0){
            int du = tien%10;
            tien = tien/10;
            switch(du){
                case 1:
                    them ="mot";
                    break;
                case 2:
                    them ="hai";
                    break;
                case 3:
                    them ="ba";
                    break;
                case 4:
                    them ="bon";
                    break;
                case 5:
                    them ="nam";
                    break;
                case 6:
                    them ="sau";
                    break;
                case 7:
                    them ="bay";
                    break;
                case 8:
                    them ="tam";
                    break;
                case 9:
                    them ="chin";
                    break;
                default:
                    throw new AssertionError();
            }
            chuoi = them.concat(" " + chuoi + " ");
            switch(index){
                case 2:
                    chuoi="ngan".concat(" " + chuoi + " ");
                    break;
                case 5:
                    chuoi="trieu".concat(" " + chuoi + " ");
                    break;
                case 6:
                    chuoi="muoi".concat(" " + chuoi + " ");
                    break;
                case 7:
                    chuoi="tram".concat(" " + chuoi + " ");
                    break;
                case 8:
                    chuoi="ti".concat(" " + chuoi + " ");
                    break;
                default:
                        break;
            }
            switch(index%3){
                case 0:
                    chuoi="muoi".concat(" " + chuoi + " ");
                    break;
                case 1:
                    chuoi="tram".concat(" " + chuoi + " ");
                    break;
            }
            index++;
        }
        System.out.printf("Thanh tien: %d\n",so);
        System.out.printf("Bang chu: %s dong\n",chuoi.trim());
        
    }
}
