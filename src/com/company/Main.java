package com.company;

import java.util.Scanner;

public class Main {
    static int n1=1,n2=1,n3=0,n4=2;

    public static void printFibonnacci(int count) {
        if (count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            n4 =  n4+n3;
            printFibonnacci(count-1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int count = in.nextInt();
        printFibonnacci(count-2);
        System.out.print(n4);
    }
}
