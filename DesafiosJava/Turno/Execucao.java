package Turno;

import java.util.Scanner;

public class Execucao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);

        // TODO: Implemente uma solução para que seja impresso a saída correto do seun
        // turno:

        if (turno == 'm' || turno == 'M')
            System.out.println("Bom Dia!");

        else if (turno == 'n' || turno == 'N')
            System.out.println("Boa Noite!");

        else if (turno == 'v' || turno == 'V')
            System.out.println("Boa Tarde!");

        else
            System.out.println("Valor Inválido!");

    }
}