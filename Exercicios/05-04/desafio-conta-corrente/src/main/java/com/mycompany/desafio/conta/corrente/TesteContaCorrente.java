package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author luifiller
 */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Luiz");
        
        cc1.depositar(10.00, 4, 5, 2023);
        
        cc1.sacar(5.00, 5, 5, 2023);
        
        cc1.exibirEstrato();
    }
}
