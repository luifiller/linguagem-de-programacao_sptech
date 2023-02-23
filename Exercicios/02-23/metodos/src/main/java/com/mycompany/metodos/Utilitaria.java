package com.mycompany.metodos;

/**
 *
 * @author luizn
 */
public class Utilitaria {

    /* Composição de um método: 
        Padrão de nomenclatura = variável (camelCase)
        Retorno: não possui porque é VOID 
        Nome: exibirLinha
        Argumentos(parâmetros): não possui porque só retornará linha e não dados, ficaria dentro do parênteses
        Corpo: fica dentro das chaves
     */
    // Variável só existe dentro do método que foi criada
    
    // Método que não possui retorno -> Método VOID
    void exibirLinha() {
        System.out.println("*----*----*----*----*");
    }

    void exibirNome(String nomeExibir) {
        System.out.println("Meu nome é: " + nomeExibir);
    }

    void exibirNomeFormatado(String nomeExibirFormatado) {
        System.out.println("\n");
        exibirLinha();
        exibirNome(nomeExibirFormatado);
        exibirLinha();
    }

}
