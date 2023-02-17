package com.mycompany.nivelamento2.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Votacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer cont = 0;
        Integer votoMussarela = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijos = 0;

        while (cont < 10) {
            System.out.println("Digite o sabor da pizza que gosta: \n"
                    + "[5] - Mussarela \n"
                    + "[25] - Calabresa \n"
                    + "[50] - Quatro queijos"
            );
            Integer numeroVotoPizza = leitor.nextInt();

            if (numeroVotoPizza.equals(5)) {
                votoMussarela += 1;
            } else if (numeroVotoPizza.equals(25)) {
                votoCalabresa += 1;
            } else {
                votoQuatroQueijos += 1;
            }

            cont++;
        }

        System.out.println(String.format("Quantidade de votos para "
                + "Mussarela: %d \n"
                + "Quantidade de votos para Calabresa: %d \n"
                + "Quantidade de votos para Quatro Queijos: %d \n",
                votoMussarela, votoCalabresa, votoQuatroQueijos)
        );
        
        if (votoMussarela > votoCalabresa && votoMussarela > votoQuatroQueijos) {
            System.out.println("O sabor favorito da turma é de Mussarela");
        } else if (votoCalabresa > votoMussarela && votoCalabresa > votoQuatroQueijos) {
            System.out.println("O sabor favorito da turma é de Calabresa");
        } else {
            System.out.println("O sabor favorito da turma é de Quatro Queijos");
        }
        
    }
}
