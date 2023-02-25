package com.mycompany.atividade02.ac01;

/**
 *
 * @author luizn
 */
public class CalculoNutricao {
    void calculaIMC(Double pesoDigitado, Double alturaDigitada){
        Double IMC = pesoDigitado / (alturaDigitada * alturaDigitada);
        
        System.out.println(String.format("Resultado do IMC: %.2f", IMC));
    }
}
