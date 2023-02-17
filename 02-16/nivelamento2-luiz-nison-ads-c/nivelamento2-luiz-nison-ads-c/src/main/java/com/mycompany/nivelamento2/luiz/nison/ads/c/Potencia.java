package com.mycompany.nivelamento2.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da base: ");
        Integer numeroBase = leitor.nextInt();

        System.out.println("Digite o número do expoente: ");
        Integer numeroExpoente = leitor.nextInt();

        Integer resultado = numeroBase;

        if (numeroExpoente.equals(0)) {
            resultado = 1;
        } else {
            for (int i = 1; i < numeroExpoente; i++) {
                resultado = resultado * numeroBase;
            }
        }
        System.out.println("Resultado é: " + resultado);
    }
}
