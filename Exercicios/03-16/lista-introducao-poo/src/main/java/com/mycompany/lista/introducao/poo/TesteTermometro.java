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

        Termometro termometro02 = new Termometro();
        termometro02.temperaturaAtual = 26.00;
        termometro02.temperaturaMax = 42.00;
        termometro02.temperaturaMin = 8.00;
        termometro02.diminuiTemperatura(13.00);
        termometro02.exibeFahreinheit();

        Termometro termometro03 = new Termometro();
        termometro03.temperaturaAtual = 26.00;
        termometro03.temperaturaMax = 42.00;
        termometro03.temperaturaMin = 8.00;
        termometro03.diminuiTemperatura(7.00);
        termometro03.exibeFahreinheit();
        termometro03.aumentaTemperatura(22.00);
        termometro03.exibeFahreinheit();
    }
}
