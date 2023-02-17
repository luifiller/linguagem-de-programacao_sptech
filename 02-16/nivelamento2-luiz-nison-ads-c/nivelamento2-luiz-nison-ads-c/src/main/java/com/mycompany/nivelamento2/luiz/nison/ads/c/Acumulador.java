package com.mycompany.nivelamento2.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Acumulador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numeroDigitado;
        Integer somatoria = 0;

        do {
            System.out.println("Digite um número: ");
            numeroDigitado = leitor.nextInt();

            somatoria += numeroDigitado;
        } while (numeroDigitado != 0);

        System.out.println("A somatória dos números é: " + somatoria);

    }
}
