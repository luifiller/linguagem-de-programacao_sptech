package com.mycompany.ac2.terceira.atividade.lista.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luifiller
 */
public class ListaInteiros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numerosInteiros = new ArrayList();
        Integer numeroDigitado;

        do {
            System.out.println("Digite número inteiros: ");
            numeroDigitado = leitor.nextInt();

            if (!numeroDigitado.equals(0)) {
                numerosInteiros.add(numeroDigitado);
            }
        } while (!numeroDigitado.equals(0));

        Integer listaVazia = numerosInteiros.size();
        
        if (listaVazia.equals(0)) {
            System.out.println("Não há nenhum número na lista.");
        } else {
            System.out.println(String.format("Pares: ", args));
            for (int i = 0; i < numerosInteiros.size(); i++) {
                Integer numeroDaVez = numerosInteiros.get(i);

                if (numeroDaVez % 2 == 0) {
                    System.out.println(numeroDaVez);
                }
            }

            System.out.println("-----------------------------------------");
            System.out.println("Ímpares: ");
            for (int i = 0; i < numerosInteiros.size(); i++) {
                Integer numeroDaVez = numerosInteiros.get(i);

                if (numeroDaVez % 2 != 0) {
                    System.out.println(numeroDaVez);
                }
            }

            Integer somaTotal = 0;
            System.out.println("-----------------------------------------");
            for (int i = 0; i < numerosInteiros.size(); i++) {
                Integer numeroDaVez = numerosInteiros.get(i);

                somaTotal += numeroDaVez;
            }
            System.out.println(String.format("Total soma: %d", somaTotal));

            System.out.println("-----------------------------------------");

            Integer menorNumero = numerosInteiros.get(0);
            for (int i = 1; i < numerosInteiros.size(); i++) {
                Integer numeroDaVez = numerosInteiros.get(i);

                if (numeroDaVez < menorNumero) {
                    menorNumero = numeroDaVez;
                }
            }
            System.out.println(String.format("Menor número da lista: %d", menorNumero));

            Integer maiorNumero = numerosInteiros.get(0);
            for (int i = 1; i < numerosInteiros.size(); i++) {
                Integer numeroDaVez = numerosInteiros.get(i);

                if (numeroDaVez > maiorNumero) {
                    maiorNumero = numeroDaVez;
                }
            }
            System.out.println(String.format("Menor número da lista: %d", maiorNumero));
        }
    }
}
