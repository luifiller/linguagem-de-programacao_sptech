package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro01 = new Termometro();
        termometro01.temperaturaAtual = 26.00;
        termometro01.temperaturaMax = 42.00;
        termometro01.temperaturaMin = 8.00;
        termometro01.aumentaTemperatura(32.00);
        termometro01.exibeFahreinheit();
    }
}
