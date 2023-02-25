package com.mycompany.atividade02.ac01;

/**
 *
 * @author luizn
 */
public class DescontoProgressivo {

    Double calcularDesconto(Double valorProduto, Integer quantidadeProduto) {
        if (quantidadeProduto.equals(1)) {
            return (valorProduto * 0.9) * quantidadeProduto;
        } else if (quantidadeProduto.equals(2)) {
            return (valorProduto * 0.8) * quantidadeProduto;
        } else {
            return (valorProduto * 0.7) * quantidadeProduto;
        }
    }

    void exibirLinha() {
        System.out.println("--------------------------------");
    }

    void exibirNotaFiscal(Double valorProduto, Integer quantidadeProduto) {
        exibirLinha();
        
        Double valorFinal = calcularDesconto(valorProduto, quantidadeProduto);
        
        System.out.println(
                String.format("Valor do produto:   R$%.2f \n"
                        + "Quantidade: %d", valorProduto, quantidadeProduto)
        );
        
        exibirLinha();
        
        
        System.out.println(
            String.format("Valor com desconto: R$%.2f", valorFinal));
    }
}
