package Percentual;

import java.util.Scanner;

public class Execucao {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();
        int x = (S * 100) / M;
        System.out.println("O desconto foi de " + (100 - x) + "%");
    }
}