package com;

import java.util.Scanner;

public class exercicio4 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

           
            System.out.println("Digite um int: ");
            int i = scan.nextInt();
            System.out.println("Digite um double: ");
            double d = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite uma frase: ");
            String s = scan.nextLine();
            

            System.out.println("A saida é: ");
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

            scan.close();

        }

}
