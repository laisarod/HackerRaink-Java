package com;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nLine = 1;

        while (sc.hasNext()) {
            
                String a = sc.nextLine();
                System.out.println(nLine+" "+a);
                nLine++;
        }
        sc.close();

    }
}
