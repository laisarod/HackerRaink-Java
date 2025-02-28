package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercicio6 {

        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        System.out.println("Digite um valor: ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("O resultado da tabuada é");
        for(int n=0; n<=10; n++){
            result = N*n;
            System.out.printf("%d x %d = %d%n", N, n, result);
        }

        bufferedReader.close();
        }

}
