package com.mycompany.segundo.projeto.nivelamento;

/**
 *
 * @author luizn
 */
public class Interpolacao {
    public static void main(String[] args) {
        
        String nome = "Luiz";
        Integer idade = 23;
        Double altura = 1.78;
        
        // Método ".format" devolve uma string e pode ser alocado numa variável
        // Quando usado o método "printf" não é e não dá para alocar a string numa variável, pois só plota na tela
        String frase = String.format("Meu nome é %s, tenho %d anos e "
                + "%.2f de altura!", nome, idade, altura
        );
        
        System.out.println(frase);
    }
}
