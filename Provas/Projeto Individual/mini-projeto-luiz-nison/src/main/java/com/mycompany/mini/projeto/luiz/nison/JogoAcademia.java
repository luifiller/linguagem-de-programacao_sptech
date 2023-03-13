package com.mycompany.mini.projeto.luiz.nison;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class JogoAcademia {

    void CalcularEretornarPontuacaoJogo() {
        Scanner leitor = new Scanner(System.in);
        int primeiraAcao;
        int segundaAcao;
        int terceiraAcao;
        int quartaAcao;
        int pontuacaoUsuario = 0;

        System.out.println("""
                           ------------------------------------------------------
                           |                  ACADEMIA SPTECH                   |
                           ------------------------------------------------------
                           | Você está na academia e tem que escolher           | 
                           | as melhores ações para se tornar uma pessoa mais   |
                           | saudável e forte. Faça escolhas conscientes e      |
                           | veja as consequências.                             |
                           ------------------------------------------------------
                           """);

        do {
            System.out.println("""
                           --------------------------------------------------------
                           |                   PRIMEIRA AÇÃO                      |
                           --------------------------------------------------------
                           | [1] Escolho pegar um gatorade para beber na academia | 
                           | [2] Escolho levar uma garrafa de água para academia  |
                           | [3] Escolho levar uma garrafa de Coca-Cola           |
                           --------------------------------------------------------
                           """);
            primeiraAcao = leitor.nextInt();

            switch (primeiraAcao) {
                case 1:
                    pontuacaoUsuario += 5;
                    break;
                case 2:
                    pontuacaoUsuario += 3;
                    break;
                case 3:
                    pontuacaoUsuario += 0;
                    break;
                default:
                    System.out.println("Número inválido. \n"
                            + "Insira um número correspondente às opções");
            }

        } while (primeiraAcao < 1 || primeiraAcao > 3);
        System.out.println(String.format("Sua pontuação foi: %d", pontuacaoUsuario));

        do {
            System.out.println("""
                           --------------------------------------------------------------------------
                           |                             SEGUNDA AÇÃO                               |
                           --------------------------------------------------------------------------
                           | [1] Prefiro ficar fazendo um pouco de esteira, mas sem esforço         | 
                           | [2] Encontro amigos e prefiro conversar com eles a fazer os exercícios |
                           | [3] Foco no meu treino e busco aumentar meus números                   |
                           --------------------------------------------------------------------------
                           """);
            segundaAcao = leitor.nextInt();

            switch (segundaAcao) {
                case 1:
                    pontuacaoUsuario += 3;
                    break;
                case 2:
                    pontuacaoUsuario -= 3;
                    break;
                case 3:
                    pontuacaoUsuario += 5;
                    break;
                default:
                    System.out.println("Número inválido. \n"
                            + "Insira um número correspondente às opções");
            }

        } while (segundaAcao < 1 || segundaAcao > 3);
        System.out.println(String.format("Sua pontuação foi: %d", pontuacaoUsuario));

        do {
            System.out.println("""
                           --------------------------------------------------------------------------
                           |                             TERCEIRA AÇÃO                              |
                           --------------------------------------------------------------------------
                           | [1] Busco consultar um amigo meu para criar um treino para mim         | 
                           | [2] Encontro um personal trainer e peço para fazer um treino meu       |
                           | [3] Gosto de ficar como apenas um treino e já estou com ele há 2 anos  |
                           --------------------------------------------------------------------------
                           """);
            terceiraAcao = leitor.nextInt();

            switch (terceiraAcao) {
                case 1:
                    pontuacaoUsuario += 3;
                    break;
                case 2:
                    pontuacaoUsuario += 5;
                    break;
                case 3:
                    pontuacaoUsuario -= 3;
                    break;
                default:
                    System.out.println("Número inválido. \n"
                            + "Insira um número correspondente às opções");
            }

        } while (terceiraAcao < 1 || terceiraAcao > 3);
        System.out.println(String.format("Sua pontuação foi: %d", pontuacaoUsuario));

        do {
            System.out.println("""
                           --------------------------------------------------------------------------
                           |                               QUARTA AÇÃO                              |
                           --------------------------------------------------------------------------
                           | [1] Meu amigo está comendo um bolo e eu pego um pedaço pequeno         | 
                           | [2] Meus amigos me chamam e eu vou ao bar comer churrasco e beber      |
                           | [3] Meu amigo está comendo um bolo, mas recuso e como minhas frutas    |
                           --------------------------------------------------------------------------
                           """);
            quartaAcao = leitor.nextInt();

            switch (quartaAcao) {
                case 1:
                    pontuacaoUsuario += 3;
                    break;
                case 2:
                    pontuacaoUsuario -= 3;
                    break;
                case 3:
                    pontuacaoUsuario += 5;
                    break;
                default:
                    System.out.println("Número inválido. \n"
                            + "Insira um número correspondente às opções");
            }

        } while (quartaAcao < 1 || quartaAcao > 3);


        System.out.println(String.format("Sua pontuação foi: %d", pontuacaoUsuario));

        if (pontuacaoUsuario == 20) {
            System.out.println(String.format("Parabéns! Você é um super saudável! \n"
                    + "Continue assim."));
        } else if (pontuacaoUsuario > 12) {
            System.out.println(String.format("Que legal. Você está no caminho certo.\n"
                    + "No caminho da saúde. Busque continuar e colherá bons frutos."));
        } else if (pontuacaoUsuario > 8) {
            System.out.println(String.format("Atenção! Zona de perigo.\n"
                    + "Tente focar mais nos exercícios e nas comidas saudáveis."));
        } else if (pontuacaoUsuario < 8 ) {
            System.out.println(String.format("Tome cuidado! Você precisa se exercitar!\n"
                    + "Seus pontos estão muito baixos e sua saúde também pode estar."));
        }

    }
}
