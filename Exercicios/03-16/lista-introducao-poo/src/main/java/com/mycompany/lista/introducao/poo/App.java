package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class App {

    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        bolo01.sabor = "morango";
        bolo01.valor = 35.00;
        bolo01.quantidadeVendida = 0;

        Bolo bolo02 = new Bolo();
        bolo02.sabor = "chocolate";
        bolo02.valor = 45.00;
        bolo02.quantidadeVendida = 0;

        Bolo bolo03 = new Bolo();
        bolo03.sabor = "maracujá";
        bolo03.valor = 55.00;
        bolo03.quantidadeVendida = 0;
        
        System.out.println("-".repeat(45));
        bolo01.comprarBolo(20);
        bolo01.comprarBolo(55);
        bolo01.comprarBolo(35);
        bolo01.exibirRelatorio();
        
        System.out.println("-".repeat(45));
        bolo02.comprarBolo(101);
        bolo02.comprarBolo(100);
        bolo02.exibirRelatorio();
        
        System.out.println("-".repeat(45));
        bolo03.comprarBolo(11);
        bolo03.comprarBolo(19);
        bolo03.exibirRelatorio();
    }
}
