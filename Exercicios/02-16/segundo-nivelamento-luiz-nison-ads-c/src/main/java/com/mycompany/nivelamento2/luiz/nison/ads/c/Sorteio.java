package com.mycompany.nivelamento2.luiz.nison.ads.c;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author luizn
 */
public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer indice = 0;
        Integer cont = 0;
        Integer totalNumeroPar = 0;
        Integer totalNumeroImpar = 0;

        System.out.println("Digite um número real de 1 a 100: ");
        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado < 1 || numeroDigitado > 100) {
            System.out.println("Por favor, insira um número inteiro de "
                    + "1 a 100."
            );

            System.out.println("Digite um número real de 1 a 100: ");
            numeroDigitado = leitor.nextInt();
        }

        Integer primeiraAparicaoNumeroDigitado = 0;
        while (indice < 200) {
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt();

            if (cont <= 0) {
                if (numeroSorteado.equals(numeroDigitado)) {
                    primeiraAparicaoNumeroDigitado = indice;

                    cont++;
                }
            }

            if (numeroSorteado % 2 == 0) {
                totalNumeroPar += 1;
            } else {
                totalNumeroImpar += 1;
            }
            indice++;
        }

        System.out.println("A 1ª aparição do número que você "
                + "digitou foi: " + primeiraAparicaoNumeroDigitado
        ); 

        System.out.println("Foram sorteados " + totalNumeroPar
                + " números pares."
        );

        System.out.println("Foram sorteados " + totalNumeroImpar
                + " números ímpares."
        );
    }
}
