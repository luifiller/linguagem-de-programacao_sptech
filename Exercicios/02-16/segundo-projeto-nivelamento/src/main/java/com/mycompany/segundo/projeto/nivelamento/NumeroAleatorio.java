package com.mycompany.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author luizn
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        
        // Para fazer o equivalente à math.Random do JavaScript,
        // é preciso criar um objeto
        
        // Foi chamada uma classe que terá método para número aleatórios
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt();
        System.out.println("Nº :" + numeroAleatorio);

        Integer numeroAleatorioLimitado = ThreadLocalRandom.current().nextInt(10, 15);
        System.out.println("Nº limitado: " + numeroAleatorioLimitado);

        Double numeroRealAleatorio = ThreadLocalRandom.current().nextDouble(0.2, 0.8);
        // System.out.println("Nº real: " + numeroRealAleatorio);
        String frase = String.format("Nº real: %.3f", numeroRealAleatorio);
        
        System.out.println(frase);
        
    }
}
