package com.example.admin.myapplication;

import java.util.Scanner;

/**
 * Created by Admin on 23/05/2016.
 */
public class Modules1 {
   /** private static Scanner input;
    public static void main(String[] args){
        System.out.println("Xin Chao");
        int a,b;
        int Tong;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so a:");
        a = input.nextInt();
        System.out.print("Nhap so b:");
        b = input.nextInt();
        Tong = a +b;
        System.out.println("TOng 2 so :" + Tong );
        input.close();

        int a,b,c;
        float x1,x2,delta;
        input = new Scanner(System.in);
        int i;
        do  {
            System.out.print("Nhap so a:");
            a = input.nextInt();
            System.out.print("Nhap so b:");
            b = input.nextInt();
            System.out.print("Nhap so c:");
            c = input.nextInt();
            if (a == 0) {
                x1 = -c / b;
                System.out.println("Phuong trinh co nghiem kep:" + x1);
            } else {
                delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.print("Phuong trinh vo nghiem");
                } else if (delta == 0) {
                    x1 = (-b) / (2 * a);
                    System.out.print("Phuong trinh co nghiem kep x1 = x2 =" + x1);
                    System.out.println(x1);
                }
                else{
                    System.out.println("Phuong trinh co 2 nghiem");
                    x1 = (float)((-b + Math.sqrt(delta))/2*a);
                    x2 = (float)((-b - Math.sqrt(delta))/2*a);
                    System.out.print("x1 =");System.out.println(x1);
                    System.out.print("x2 =");System.out.println(x2);
                    System.out.println();
                }
            }
            System.out.println();
            System.out.print("Ban co muon tiep tuc khong(1/0)");
            i = input.nextInt();
            System.out.println();
        }
        while(i == 1 );



    }*/
}
