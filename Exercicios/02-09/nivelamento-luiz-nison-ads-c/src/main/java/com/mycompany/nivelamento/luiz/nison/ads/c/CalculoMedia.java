package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeUser = leitor.nextLine();

        System.out.println("Digite sua primeira nota: ");
        Double nota01 = leitor.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        Double nota02 = leitor.nextDouble();

        Double mediaNota = ((nota01 + nota02) / 2);

        System.out.println("Olá + "
                + nomeUser + ". Su média foi "
                + mediaNota + "."
        );

    }
}
