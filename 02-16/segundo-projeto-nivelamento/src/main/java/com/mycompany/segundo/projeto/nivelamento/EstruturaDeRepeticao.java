package com.mycompany.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class EstruturaDeRepeticao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // For Crescente
        System.out.println("for de 0 a 10");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // For Decrescente
        System.out.println("for de 10 a 0");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // Estrutura While
        System.out.println("Estrutura while");

        int i = 0;
        while (i <= 10) {
            System.out.println(i);

            i++;
        }
        System.out.println("While advinhe o número");
        System.out.println("Digite um número");
        // O número deverá ser 42
        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado != 42) {
            System.out.println("Tente novamente. Digite um número: ");

            numeroDigitado = leitor.nextInt();
        }

        System.out.println("Parabéns! Você acertou.");

        // Estutura Do-While
        /* 
        Com Do-While a pergunta é feita apenas depois de repetir uma vez, 
        ou seja, você digitará e depois terá que digitar de novo.
         */
        System.out.println("Estrutura Do & While");

        do {
            System.out.println("Digite um número: ");

            numeroDigitado = leitor.nextInt();
        } while (numeroDigitado != 42);

        System.out.println("Parabéns! Você acertou.");

    }
}
