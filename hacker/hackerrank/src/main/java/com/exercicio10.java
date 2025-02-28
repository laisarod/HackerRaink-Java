package com;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        int B = sc.nextInt();
        int H = sc.nextInt();

        if (0>=B || B>=100 && 0>=H || H>=100 ) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            result = B *H;
            System.out.println(" "+result);
        }

        sc.close();
    }
}
