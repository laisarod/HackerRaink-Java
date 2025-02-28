package com;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s1 = new String[3];
        int[] x = new int[3];
        
        System.out.println("================================");
       
        for (int i = 0; i < 3; i++) {   
            System.out.print("Digite uma string: ");
            s1[i] = sc.next();  

            System.out.print("Digite um número: ");
            x[i] = sc.nextInt();   

            
        }
        
        System.out.println("================================");

        for(int n=0; n<3; n++){
            System.out.printf("%-15s%03d%n", s1[n], x[n]);
        }
        System.out.println("================================");

        sc.close();

    }
    
}
