package com.mycompany.ac2.segunda.atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class TesteLista {

    public static void main(String[] args) {

        // Instancia a List importando da "java.util";
        // importa a ArrayList do "java.util";
        List listraEstranha = new ArrayList();

        
        // Métodos mais usados: 
        // add: adiciona objeto na lista
        // get: busca objeto pelo índice
        // size: retorna o tamanho da lista (semelhante ao length)
        // remove: remove por índice ou objeto
        listraEstranha.add("Xampson");
        listraEstranha.add(42);
        listraEstranha.add(42.0);
        listraEstranha.add(false);

        System.out.println(listraEstranha);

        // Criando uma lista com tipagem de "String"
        // Lista é sempre no plural
        List<String> nomes = new ArrayList();
        nomes.add("Luiz");
        nomes.add("Pedro");
        nomes.add("William");
        nomes.add("50");

        System.out.println(nomes);

        /*
        "get()" pegara a posição iniciando da posição 0
        assim como vetor no JavaScript
         */
        String segundoNome = nomes.get(1);
        System.out.println("Nome do índice 2: " + segundoNome + ".");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(String.format("%dº nome: %s",
                    i + 1, nomes.get(i)));
        }

        // Removendo o Luiz
        // Deve ser sempre priorizado o uso de remove por ínidice
        nomes.remove("Luiz");
        nomes.remove(0);

        System.out.println(nomes);

        // LIsta de objetos com nossas classes
        List<Atividade> atividades = new ArrayList();

        Atividade atividade01 = new Atividade("Pull request",
                "Luiz Nison",
                5);
        Atividade atividade02 = new Atividade("Merge",
                "Luiz Nison",
                2);

        atividades.add(atividade01);
        atividades.add(atividade02);
        atividades.add(new Atividade("Create branch 'wip-001-dashboard'",
                "Luiz Nison",
                1));

        System.out.println(atividades);

        // Exiba somente atividades com menos de 5 dias estimados
        for (int i = 0; i < atividades.size(); i++) {
            Atividade atividadeDaVez = atividades.get(i);
            
            if (atividadeDaVez.getDiasEstimados() < 5) {
                System.out.println(atividadeDaVez);
            }
        }

        // Enhanced for
        for (Atividade atividadeDaVez : atividades) {
            if (atividadeDaVez.getDiasEstimados() < 5) {
                System.out.println("------------------------------------ \n");
                System.out.println(atividadeDaVez);
            }
        }

    }
}
