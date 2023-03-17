package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    Double aumentaTemperatura(Double valorAumentoTemperatura) {
        Double temperaturaAumentada = temperaturaAtual + valorAumentoTemperatura;

        if (valorAumentoTemperatura > 0) {
            if (temperaturaAumentada > temperaturaMax) {
                temperaturaAtual = temperaturaMax;
            } else {
                temperaturaAtual = temperaturaAumentada;
            }
        } else {
            System.out.println("Insira um valor maior que 0 para "
                    + "ser acrescentado a temperatura atual.");
        }

        return temperaturaAtual;
    }

    Double diminuiTemperatura(Double valorDiminuiTemperatura) {
        Double temperaturaDiminuida = temperaturaAtual - valorDiminuiTemperatura;

        if (valorDiminuiTemperatura > 0) {
            if (temperaturaDiminuida > temperaturaMax) {
                temperaturaAtual = temperaturaMin;
            } else {
                temperaturaAtual = temperaturaDiminuida;
            }
        } else {
            System.out.println("Insira um valor maior que 0 para "
                    + "ser subtraido da temperatura atual.");
        }

        return temperaturaAtual;
    }

    void exibeFahreinheit() {
        Double temperaturaFahreinheit = (temperaturaAtual * 1.8) + 32;
        
        System.out.println(String.format("Temperatura atual: %.2f",
                temperaturaAtual));
        
        System.out.println(String.format("Temperatura atual em "
                + "Fahreinheit: %.2fºF", temperaturaFahreinheit));
    }
}
