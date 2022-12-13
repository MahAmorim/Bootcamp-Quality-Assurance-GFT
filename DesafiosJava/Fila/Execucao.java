package Fila;

import java.util.Scanner;

public class Execucao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idade1 = scanner.nextInt();
    int idade2 = scanner.nextInt();
    int idade3 = scanner.nextInt();

    // TODO: Implemente um condição de verifique a média de idade da turma conforme
    // a descrição do desafio:

    int media = (idade1 + idade2 + idade3) / 3;

    if ((media >= 0) && (media < 26)) {
      System.out.println("Jovem!");
    } else if ((media >= 26) && (media < 60)) {
      System.out.println("Adulta!");
    } else if ((media >= 60)) {
      System.out.println("Idosa!");
    }
  }
}