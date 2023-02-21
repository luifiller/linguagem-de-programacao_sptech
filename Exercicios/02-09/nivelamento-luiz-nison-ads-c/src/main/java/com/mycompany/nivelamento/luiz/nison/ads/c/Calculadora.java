package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        Double numero01 = leitor.nextDouble();

        System.out.println("Digite outro um número real: ");
        Double numero02 = leitor.nextDouble();

        Double soma = numero01 + numero02;
        Double subtracao = numero01 - numero02;
        Double multiplicacao = numero01 * numero02;
        Double divisao = numero01 / numero02;

        System.out.println("Resultado da soma: \n"
                + soma
        );

        System.out.println("Resultado da subtração: \n"
                + subtracao
        );

        System.out.println("Resultado da multiplicação: \n"
                + multiplicacao
        );

        System.out.println("Resultado da divisão: \n"
                + divisao
        );
    }
}
