package com.mycompany.nivelamento2.luiz.nison.ads.c;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author luizn
 */
public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10: ");
        Integer numeroDigitado = leitor.nextInt();

        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);

        int i = 0;

        while (numeroAleatorio != numeroDigitado) {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);

            System.out.println("Infelizmente não foi dessa vez! O número "
                    + "sorteado foi: " + numeroAleatorio
            );

            i++;
        }

        if (i <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (i <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }

    }
}
