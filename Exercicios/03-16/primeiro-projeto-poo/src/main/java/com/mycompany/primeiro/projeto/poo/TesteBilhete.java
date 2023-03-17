package com.mycompany.primeiro.projeto.poo;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteBilhete {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Xampson";
        bilhete01.possuiMeiaEntrada = true;
        bilhete01.saldo = 0.0;

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Luiz";
        bilhete02.possuiMeiaEntrada = false;
        bilhete02.saldo = 0.0;

        bilhete01.usar();
        bilhete01.recarregar(100.00);
        bilhete01.usar();
        System.out.println("-".repeat(30));
        bilhete02.recarregar(3.50);
        bilhete02.usar();
        bilhete02.recarregar(10.00);
        bilhete02.usar();
        
        
    }
}
