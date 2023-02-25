package com.mycompany.atividade02.ac01;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteValidacaoNumerica {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica validaNumeroPrimo = new ValidacaoNumerica();
        Integer numeroDigitado;

        do {
            System.out.println("Digite um número inteiro positivo: ");
            numeroDigitado = leitor.nextInt();
            
            validaNumeroPrimo.verificarPrimo(numeroDigitado);
        } while (numeroDigitado > 0);
    }
}
