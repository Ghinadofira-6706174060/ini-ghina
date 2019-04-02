package com.company;

import java.util.Scanner;

public class Main {
    static int n1=1,n2=1,n3=0,n4=2;

    public static void printFibonnacci(int count) {
       int a[] =  new int[n];

        a[0] = 1;
        a[1] = 1;

        for (int i =2; i < n; i++){
            a[i] = a[i - 2] + a[i - 1];
        }
        for (int i = n - 1; i >= 0; i--){
            System.out.print(a[i] +"");
        }
    }
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int count = in.nextInt();
        reserveFibonacci(count);
    }
}
