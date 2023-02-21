package com.mycompany.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class SwitchCase {

    public static void main(String[] args) {

        // o usuário digita um número
        // E eu mostro o dia da semana equivalente
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer diaSemana = leitor.nextInt();

        // atalho do switch case -> sw + TAB
        // em todos os cases tem que ter um "break" para quando terminar não seguir para os outros cases
        // o "default" é utilizado quando a resposta foge dos cases
        switch (diaSemana) {
            case 1:
                System.out.println("Segundou");
                break;
            
            case 2:
                System.out.println("Terçou");
                break;
                
            case 3:
                System.out.println("Quartou");
                break;
                
            case 4:
                System.out.println("Quintou");
                break;
                
            case 5:
                System.out.println("Sextou");
                break;
                
            case 6:
                System.out.println("Sabadou");
                break;
                
            case 7:
                System.out.println("Domingou");
                break;
                
            default:
                System.out.println("Dia inválido!");
        }
    }
}
