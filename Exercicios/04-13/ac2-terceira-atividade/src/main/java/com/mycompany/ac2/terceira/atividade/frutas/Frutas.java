package com.mycompany.ac2.terceira.atividade.frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luifiller
 */
public class Frutas {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList();

        Scanner leitor = new Scanner(System.in);
        int cont = 0;

        frutas.add("mamão");
        frutas.add("nanana");
        frutas.add("maçã");
        frutas.add("goiaba");

        System.out.println(frutas);

        System.out.println("Busque pelo nome da fruta: ");
        String frutaBuscada = leitor.nextLine();

        for (int i = 0; i < frutas.size(); i++) {

            String frutaDaVez = frutas.get(i).toLowerCase();

            if (frutaDaVez.equals(frutaBuscada)) {
                cont++;
            }
        }

        if (cont == 1) {
            System.out.println(String.format("A fruta %s existe na lista",
                    frutaBuscada));
        } else {
            System.out.println(String.format("Não existe a fruta %s na lista",
                    frutaBuscada));
        }

    }
}
