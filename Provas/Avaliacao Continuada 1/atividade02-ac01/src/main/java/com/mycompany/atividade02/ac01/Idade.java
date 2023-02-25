package com.mycompany.atividade02.ac01;

/**
 *
 * @author luizn
 */
public class Idade {

    void exibirFaixaEtaria(Integer idade) {
        if (idade >= 0 && idade <= 2) {
            System.out.println("Bebê");
        } else if (idade <= 11) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 30) {
            System.out.println("Jovem");
        } else if (idade <= 60){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
