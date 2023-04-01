package com.mycompany.primeiro.projeto.encapsulamento;

/**
 *
 * @author luifiller
 */
public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setNomeTitular("Luiz");

        ContaBancaria conta02 = new ContaBancaria();
        conta02.setNomeTitular("Pedro");

        conta01.depositar(100.0);
        conta01.sacar(5.0);
        System.out.println("C1 R$" + conta01.getSaldo());

        conta02.depositar(50.0);
        conta02.sacar(10.0);
        System.out.println("C2 R$" + conta02.getSaldo());
        
        String nomeConta01 = conta01.getNomeTitular();
        
        System.out.println(String.format("Olá, %s", nomeConta01));
    }

}
