package com;

import java.util.Scanner;


public class exercicio2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int a = num.nextInt();
        System.out.println("Digite o 2º número: ");
        int b = num.nextInt();
        System.out.println("Digite o 3º número: ");
        int c = num.nextInt();

        num.close();

        System.out.println("Você digitou: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       }
}
