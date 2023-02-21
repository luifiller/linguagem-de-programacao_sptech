package com.mycompany.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numeroDigitado;
        Integer resultadoOperacao;
        Integer operacaoSelecionada;
        Integer resultadoPotencia = 1;

        do {
            System.out.println("Digite o número correspondente a operação "
                    + "desejada: "
            );

            System.out.println("1 - Soma \n"
                    + "2 - Multiplicação \n"
                    + "3 - Divisão \n"
                    + "4 - Subtração \n"
                    + "5 - Potencia \n"
                    + "6 - Resto \n"
                    + "0 - Sair \n"
            );
            operacaoSelecionada = leitor.nextInt();

            switch (operacaoSelecionada) {
                case 0:
                    System.out.println("Até logo!");
                    break;

                case 1:
                    System.out.println("Digite um número inteiro: ");
                    numeroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultadoOperacao = (numeroDigitado + i);
                        System.out.println(String.format("%d + %d = "
                                + "%d \n", numeroDigitado, i,
                                resultadoOperacao));
                    }

                    break;

                case 2:
                    System.out.println("Digite um número inteiro: ");
                    numeroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultadoOperacao = (numeroDigitado * i);
                        System.out.println(String.format("%d * %d = "
                                + "%d \n", numeroDigitado, i,
                                resultadoOperacao));
                    }

                    break;

                case 3:
                    System.out.println("Digite um número inteiro: ");
                    numeroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultadoOperacao = (numeroDigitado / i);
                        System.out.println(String.format("%d ÷ %d = "
                                + "%d \n", numeroDigitado, i,
                                resultadoOperacao));
                    }

                    break;

                case 4:
                    System.out.println("Digite um número inteiro: ");
                    numeroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultadoOperacao = (numeroDigitado - i);
                        System.out.println(String.format("%d - %d = "
                                + "%d \n", numeroDigitado, i,
                                resultadoOperacao));
                    }

                    break;
                
                case 5:
                    System.out.println("Digite um número inteiro: ");
                    numeroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultadoPotencia = (resultadoPotencia * numeroDigitado);
                        
                        System.out.println(String.format("%d ^ %d = "
                                + "%d \n", numeroDigitado, i,
                                resultadoPotencia));
                    }
                    resultadoPotencia = 1;
                    break;

                case 6:
                    System.out.println("Digite um número inteiro: ");
                    numeroDigitado = leitor.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        resultadoOperacao = (numeroDigitado % i);
                        System.out.println(String.format("%d %% %d = "
                                + "%d \n", numeroDigitado, i,
                                resultadoOperacao));
                    }

                    break;
            }
        } while (operacaoSelecionada != 0);
    }
}