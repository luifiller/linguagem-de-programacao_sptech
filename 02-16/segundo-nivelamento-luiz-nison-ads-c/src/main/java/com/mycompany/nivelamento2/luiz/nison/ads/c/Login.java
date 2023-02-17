package com.mycompany.nivelamento2.luiz.nison.ads.c;

import java.util.Scanner;

/**
 *
 * @author luizn
 */
public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String login = "admin";
        String senha = "#SPtech2022";

        System.out.println("Digite o seu nome de usuário: ");
        String nomeDigitado = leitor.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaDigitada = leitor.nextLine();

        while ((!nomeDigitado.equals(login)) || (!senhaDigitada.equals(senha))) {
            System.out.println("Login e/ou senha inválidos");

            System.out.println("Digite o seu nome de usuário: ");
            nomeDigitado = leitor.nextLine();

            System.out.println("Digite sua senha: ");
            senhaDigitada = leitor.nextLine();
        }

        System.out.println("Login realizado com sucesso");

    }
}
