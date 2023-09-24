package com.num.math;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.abs(-100));
        //System.out.println(Math.max(10,11));
        //System.out.println(Math.min(0,1));
        //System.out.println(Math.pow(3,3));
        //System.out.println(Math.sqrt(9));
        System.out.println("解一元二次方程");
        System.out.println("a:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("b:");
        Scanner sc2 = new Scanner(System.in);
        double b = sc.nextInt();
        System.out.println("c:");
        Scanner sc3 = new Scanner(System.in);
        double c = sc.nextInt();
        double deta = Math.pow(b, 2) - 4 * a * c;
        if (deta < 0) {
            System.out.println("无解");
        } else if (deta == 0) {
            double x = -b / (2 * a);
            System.out.println("此方程只有一个解");
            System.out.println("解是：x=" + x);
        } else {
            double x1 = -b + Math.sqrt(deta) / (2 * a);
            double x2 = -b - Math.sqrt(deta) / (2 * a);
            System.out.println("此方程只有两个解");
            System.out.println("解是：x1=" + x1);
            System.out.println("解是：x2=" + x2);
        }

    }
}