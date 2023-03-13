package com.mycompany.mini.projeto.luiz.nison;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class VidaSaudavel {

    void avaliarEretornarAvaliacaoSaude() {
        Scanner leitor = new Scanner(System.in);
        Integer primeiraAcaoDia;
        Integer cafeManhaDiario;
        Integer habitoExercicios;

        do {
            System.out.println("""
                               ------------------------------------------------------------
                               | Quando você acorda, qual é a primeira coisa que faz?     |
                               ------------------------------------------------------------
                               | [1] Levanto e me alongo                                  |
                               | [2] Vou direto no celular nos primeiros momentos do dia  |
                               ------------------------------------------------------------
                               """);
            primeiraAcaoDia = leitor.nextInt();

            if (!primeiraAcaoDia.equals(1) && !primeiraAcaoDia.equals(2)) {
                System.out.println("Número inválido. \n"
                        + "Insira um número correspondente às opções");
            }

        } while (!primeiraAcaoDia.equals(1) && !primeiraAcaoDia.equals(2));

        do {
            System.out.println("""
                               ------------------------------------------------------------
                               | Qual é o seu café da manhã diário?                       |
                               ------------------------------------------------------------
                               | [1] Frutas e cereais                                     |
                               | [2] Pão na chapa e ovo mexido                            |
                               ------------------------------------------------------------
                               """);
            cafeManhaDiario = leitor.nextInt();

            if (!cafeManhaDiario.equals(1) && !cafeManhaDiario.equals(2)) {
                System.out.println("Número inválido. \n"
                        + "Insira um número correspondente às opções");
            }

        } while (!cafeManhaDiario.equals(1) && !cafeManhaDiario.equals(2));

        do {
            System.out.println("""
                               ------------------------------------------------------------
                               | Qual é o seu café da manhã diário?                       |
                               ------------------------------------------------------------
                               | [1] Não me exercito com frequência                       |
                               | [2] Tento me exercitar sempre que possível               |
                               ------------------------------------------------------------
                               """);
            habitoExercicios = leitor.nextInt();

            if (!habitoExercicios.equals(1) && !habitoExercicios.equals(2)) {
                System.out.println("Número inválido. \n"
                        + "Insira um número correspondente às opções");
            }

        } while (!habitoExercicios.equals(1) && !habitoExercicios.equals(2));

        Boolean saudavel = primeiraAcaoDia.equals(1) || cafeManhaDiario.equals(1) || habitoExercicios.equals(2);
        Boolean naoSaudavel = primeiraAcaoDia.equals(2) || cafeManhaDiario.equals(2) || habitoExercicios.equals(1);

        System.out.println("A partir das suas respostas, percebe-se que você ");
        
        if (saudavel) {
            System.out.println("é saudável.");
        } else if (naoSaudavel) {
            System.out.println("não é saudável.");
        } else {
            System.out.println("está no caminho para ser saudável.");
        }
    }
}
