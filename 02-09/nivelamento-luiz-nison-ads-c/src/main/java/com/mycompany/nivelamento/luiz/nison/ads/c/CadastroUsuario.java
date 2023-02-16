package com.mycompany.nivelamento.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu login: ");
        String loginUser = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senhaUser = leitor.nextLine();
        
        System.out.println("Quantidade de vezes que deseja errar a senha "
                + "antes de ser bloqueado: ");
        Integer qtdTentativa = leitor.nextInt();
        
        System.out.println("Seu login é "
                + loginUser + " e sua senha é " 
                + senhaUser + ". Você tem "
                + qtdTentativa + " tentativas antes de ser bloqueado."
        );
    }
}
