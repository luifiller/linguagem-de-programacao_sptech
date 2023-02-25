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
            
            if (numeroDigitado < 0){
                System.out.println("O número é negativo! Encerrando programa");
                break;
            }
            
            validaNumeroPrimo.verificarPrimo(numeroDigitado);
        } while (numeroDigitado > 0);
    }
}
