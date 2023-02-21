package com.mycompany.segundo.projeto.nivelamento;

/**
 *
 * @author luizn
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = true;
        
        String frase;
        
        if (bloqueado) {
            frase = "Usuário bloqueado";
        } else {
            frase = "Usuuário desbloqueado";
        }
        
        System.out.println(frase);
        
        frase = bloqueado ? "Uusário bloqueado" : "Usuário desbloqueado";
        
        // Também dá para usar com outros tipos
        

        // Cenário: se o salário for maior que R$1000.00 o bônus será de 0.15
        // se for menor que R$1000.00 o bônus é de 0.10
        
        Double bonus = 0.0;
        Double salario = 1075.50;
        
        if (salario >= 1000.00) {
            bonus = 0.15;
        } else {
            bonus = 0.10;
        }
        
        bonus = salario >= 1000.00 ? 0.15 : 0.10;
        
        System.out.println("O bônus é " + bonus);
    }
}
