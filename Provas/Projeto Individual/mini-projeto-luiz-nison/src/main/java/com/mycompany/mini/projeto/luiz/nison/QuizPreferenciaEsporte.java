package com.mycompany.mini.projeto.luiz.nison;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class QuizPreferenciaEsporte {

    void analisarEretornarPreferenciaEsporte() {
        Scanner leitor = new Scanner(System.in);

        Integer carcateristicaPerfilDigitado;
        Integer preferenciaDigitado;
        Integer esperaTreinoDigitado;

        do {
            System.out.println("""
                        ------------------------------------------------------------------
                        | Defina qual característica está mais próxima do seu perfil:    |
                        ------------------------------------------------------------------
                        | [1] Cooperativo                                                |
                        | [2] Competitivo                                                |
                        ------------------------------------------------------------------
                           """);
            carcateristicaPerfilDigitado = leitor.nextInt();

            if (!carcateristicaPerfilDigitado.equals(1) && !carcateristicaPerfilDigitado.equals(2)) {
                System.out.println("Número inválido. \n"
                        + "Insira um número correspondente às opções");
            }

        } while (!carcateristicaPerfilDigitado.equals(1) && !carcateristicaPerfilDigitado.equals(2));

        do {
            System.out.println("""
                        --------------------------------------------------------------    
                        | Na hora de praticar alguma atividade, sua preferência é :  |
                        --------------------------------------------------------------
                        | [1] Ter contato com a natureza                             |
                        | [2] Desbravar o meio urbano                                |
                        | [3] Fazer amizades                                         |
                        | [4] Entrar em contato consigo mesmo                        |
                        --------------------------------------------------------------
                           """);
            preferenciaDigitado = leitor.nextInt();

            if (!preferenciaDigitado.equals(1) && !preferenciaDigitado.equals(2)
                    && !preferenciaDigitado.equals(3) && !preferenciaDigitado.equals(4)) {
                System.out.println("Número inválido. \n"
                        + "Insira um número correspondente às opções");
            }

        } while (!preferenciaDigitado.equals(1) && !preferenciaDigitado.equals(2)
                && !preferenciaDigitado.equals(3) && !preferenciaDigitado.equals(4));

        do {
            System.out.println("""
                        ---------------------------------------------
                        | O que você mais espera de um bom treino?  | 
                        ---------------------------------------------
                        | [1] Queime calorias e gorduras            |
                        | [2] Ensinamentos de vida                  |
                        | [3] Diversão e aventura                   |
                        | [4] Calmaria e tranquilidade              |
                        ---------------------------------------------
                           """);
            esperaTreinoDigitado = leitor.nextInt();

            if (!esperaTreinoDigitado.equals(1) && !esperaTreinoDigitado.equals(2)
                    && !esperaTreinoDigitado.equals(3) && !esperaTreinoDigitado.equals(4)) {
                System.out.println("Número inválido. \n"
                        + "Insira um número correspondente às opções");
            }

        } while (!esperaTreinoDigitado.equals(1) && !esperaTreinoDigitado.equals(2)
                && !esperaTreinoDigitado.equals(3) && !esperaTreinoDigitado.equals(4));

        Boolean caminhada = (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(1))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(4))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(2) && esperaTreinoDigitado.equals(1))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(2) && esperaTreinoDigitado.equals(4))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(4));

        Boolean corrida = (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(1))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(4) && esperaTreinoDigitado.equals(1));

        Boolean travessiaRepresa = (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(4))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(4))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(4) && esperaTreinoDigitado.equals(4));

        Boolean travessiaMar = (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(2))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(3));

        Boolean ciclismo = (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(2) && esperaTreinoDigitado.equals(2))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(2) && esperaTreinoDigitado.equals(3))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(3));

        Boolean trilha = (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(1) && esperaTreinoDigitado.equals(3))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(2) && esperaTreinoDigitado.equals(4))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(3))
                || (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(4) && esperaTreinoDigitado.equals(3))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(3));

        Boolean futebol = (carcateristicaPerfilDigitado.equals(1) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(1))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(2) && esperaTreinoDigitado.equals(1))
                || (carcateristicaPerfilDigitado.equals(2) && preferenciaDigitado.equals(3) && esperaTreinoDigitado.equals(1));

        System.out.println("O seu esporte recomendado é: ");

        if (caminhada) {
            System.out.println("Caminhada");
        } else if (corrida) {
            System.out.println("Corrida");
        } else if (travessiaRepresa) {
            System.out.println("Travessia represa");
        } else if (travessiaMar) {
            System.out.println("Travessia mar");
        } else if (ciclismo) {
            System.out.println("Ciclismo");
        } else if (trilha) {
            System.out.println("Trilha");
        } else if (futebol) {
            System.out.println("Futebol");
        } else {
            System.out.println("Yoga");
        }
    }
}
