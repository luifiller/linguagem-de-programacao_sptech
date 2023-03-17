package com.mycompany.primeiro.projeto.poo;

/**
 *
 * @author luizn
 */
public class BilheteUnico {

    // Atributos = Características
    String nomeTitular;
    Double saldo;
    Boolean possuiMeiaEntrada;

    // Recarregar e exibir o valor recarregado e saldo
    /* 
        Quando um atributo é declarado antes do método, 
        ele pode ser acessado dentro do método, sem precisar ser declarado
        dentro do parênteses do método
     */
    void recarregar(Double valorRecarga) {
        if (valorRecarga > 0) {
            saldo += valorRecarga;
            System.out.println(String.format("%s, você recarregou %.2f. \n"
                    + "E seu saldo agora é: %.2f", nomeTitular, valorRecarga, saldo));
        } else {
            System.out.println("Insira um valor positivo.");
        }
    }

    void usar() {
        if (possuiMeiaEntrada && saldo >= 2.20) {
            saldo -= 2.20;
        } else if (saldo >= 4.40) {
            saldo -= 4.40;
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(String.format("Seu saldo é: %.2f", saldo));
    }

}
