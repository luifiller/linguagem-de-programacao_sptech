package com.mycompany.ac2.terceira.atividade.carros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class TesteCarro {

    public static void main(String[] args) {
        List<Carro> carros = new ArrayList();

        carros.add(new Carro("Uno", "Fiat", 2015, 70000.00));
        carros.add(new Carro("Agile", "Chevrolet", 2017, 90000.00));
        carros.add(new Carro("Prisma", "Chevrolet", 2010, 13000.00));
        carros.add(new Carro("Fiesta", "Ford", 2020, 85000.00));

        System.out.println("Carros com ano maior que 2018: ");
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getAno() > 2018) {
                System.out.println(carros.get(i));
            }
        }

        System.out.println("Carros com valor menor que R$60.000,00: ");
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getValor() < 60000.00) {
                System.out.println(carros.get(i));
            }
        }

        System.out.println("Carros da Chevrolet: ");
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getMarca().equalsIgnoreCase("chevrolet")) {
                System.out.println(carros.get(i));
            }
        }
    }
}
