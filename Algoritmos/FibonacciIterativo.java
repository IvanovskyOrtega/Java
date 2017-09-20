package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int a = 0, b = 1, c = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Serie de Fibonacci desde 1 hasta n (version iterativa).");
        System.out.println("Ingresa n: ");
        n = input.nextInt();
        for (int i = 0; i < n ; i++) {
            if(n < 2 && n >= 0){
                System.out.println(n+"\n");
            }
            else{
                System.out.println(c+"\n");
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
