package com.mycompany.avaliacao.continuada1.luiz.filler;

import java.util.Scanner;

/**
 *
 * Obrigado pela prova professores. Foi bem legal fazê-la!
 * @author luizn
 */
public class LuizFiller {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer opcaoDigitada;
        Double valorDigitadoDeposito;
        Double totalValorConta = 0.00;
        Double valorDigitadoSaque = 0.00;
        Double projecaoRendimento = 0.00;

        do {
            System.out.println("--------------------------------------\n"
                    + "|       SPTech    Investimentos      | \n"
                    + "--------------------------------------\n"
                    + "| Olá, o que deseja fazer:           | \n"
                    + "--------------------------------------\n"
                    + "| 1 - Depoitar                       |\n"
                    + "| 2 - Sacar                          |\n"
                    + "| 3 - Simular rendimentos            |\n"
                    + "| 0 - Sair                           |\n"
                    + "--------------------------------------\n"
            );
            opcaoDigitada = leitor.nextInt();

            switch (opcaoDigitada) {
                case 1:
                    do {
                        System.out.println("Digite um valor para ser depositado: ");
                        valorDigitadoDeposito = leitor.nextDouble();

                        if (valorDigitadoDeposito < 0) {
                            System.out.println("Valor inválido");
                        } else {
                            totalValorConta += valorDigitadoDeposito;
                            System.out.println(String.format("Depósito realizado - "
                                    + "Saldo atual: R$%.2f", totalValorConta)
                            );
                        }
                    } while (valorDigitadoDeposito < 0);

                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    valorDigitadoSaque = leitor.nextDouble();

                    if (valorDigitadoSaque < 0) {
                        System.out.println("Valor inválido");
                    } else {
                        if (valorDigitadoSaque > totalValorConta) {
                            System.out.println("Valor inválido.");
                        } else {
                            totalValorConta -= valorDigitadoSaque;
                            System.out.println(String.format("Saque realizado - "
                                    + "Saldo atual: R$%.2f", totalValorConta)
                            );
                        }
                    }

                    break;

                case 3:
                    projecaoRendimento = totalValorConta;
                    System.out.println(String.format("| Saldo Atual: R$%.2f        |", totalValorConta));
                    for (Integer i = 1; i <= 12; i++) {
                        projecaoRendimento = projecaoRendimento * 1.1;
                        System.out.println(String.format("--------------------------------\n"
                                + "| Mês %d | Saldo: R$%.2f      |\n"
                                + "--------------------------------", i, projecaoRendimento));
                    }

                    break;

                case 0:

                    break;
                default:
                    System.out.println("Valor inválido!");
            }

        } while (opcaoDigitada != 0);

    }
}
