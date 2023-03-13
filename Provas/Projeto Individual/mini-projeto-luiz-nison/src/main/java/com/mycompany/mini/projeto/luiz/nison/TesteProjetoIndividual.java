package com.mycompany.mini.projeto.luiz.nison;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class TesteProjetoIndividual {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculoIMC calcIMC = new CalculoIMC();
        QuizPreferenciaEsporte quizPrefEsporte = new QuizPreferenciaEsporte();
        VidaSaudavel vidaSaudavel = new VidaSaudavel();
        JogoAcademia jogoAcademia = new JogoAcademia();

        Integer opcaoDigitadaUsuario;

        System.out.println("""
                           -----------------------------------------
                           | Olá! Sou seu Help Care.               |
                           -----------------------------------------
                           | Como posso te chamar? Digite abaixo.  |
                           -----------------------------------------
                           """);
        String nomeDigitadoUsuario = leitor.nextLine();

        do {
            System.out.println("""
                        ---------------------------------------
                        |              Help Care              |
                        --------------------------------------- 
                        |  Digite o número da opção desejada  |
                        ---------------------------------------
                        | [1] Calculadora IMC                 |
                        | [2] Quiz de preferência de esportes |
                        | [3] Quiz de vida saudável           |
                        | [4] Jogo da academia SPTech         |
                        | [0] Sair                            |
                        ---------------------------------------
                           """);
            opcaoDigitadaUsuario = leitor.nextInt();

            switch (opcaoDigitadaUsuario) {
                case 1:
                    System.out.println(String.format("Olá, %s. Digite seu peso: ",
                            nomeDigitadoUsuario));
                    Double pesoDigitadoUsuario = leitor.nextDouble();

                    System.out.println(String.format("Agora digite sua altura:"));
                    Double alturaDigitadoUsuario = leitor.nextDouble();

                    Double totalIMCUsuario = calcIMC.calcularIMC(pesoDigitadoUsuario, alturaDigitadoUsuario);

                    String classificacaoIMCUsuario = calcIMC.retornarClassificacaoIMC(totalIMCUsuario);
                    String riscoComoborbidadeUsuario = calcIMC.retornarRiscoComorbidade(totalIMCUsuario);

                    System.out.println(String.format("Seu IMC é de: %.2f \n"
                            + "E, segundo OMS(2000), sua classificação é: %s. \n"
                            + "Havendo %s de ter alguma comorbidade", totalIMCUsuario, 
                            classificacaoIMCUsuario, riscoComoborbidadeUsuario));

                    break;

                case 2:
                    quizPrefEsporte.analisarEretornarPreferenciaEsporte();

                    break;

                case 3:
                    vidaSaudavel.avaliarEretornarAvaliacaoSaude();

                    break;

                case 4:
                    jogoAcademia.CalcularEretornarPontuacaoJogo();

                    break;

                case 0:
                    System.out.println(String.format("Muito obrigado, $s. "
                            + "Até logo!", nomeDigitadoUsuario));

                    break;

                default:
                    System.out.println("Número incorreto! "
                            + "Digite o número válido para uma das opções.");
                    ;
            }
            
        } while (opcaoDigitadaUsuario != 0);
    }
}
