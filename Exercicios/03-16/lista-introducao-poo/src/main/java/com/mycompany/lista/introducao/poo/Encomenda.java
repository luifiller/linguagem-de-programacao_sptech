package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class Encomenda {

    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double calcularFrete() {
        Double totalFrete;

        if (distancia <= 50.00) {
            totalFrete = 3.00;
        } else if (distancia <= 200.00) {
            totalFrete = 5.00;
        } else {
            totalFrete = 7.00;
        }

        if (tamanho.equals("P")) {
            totalFrete += (valorEncomenda * 0.01);
        } else if (tamanho.equals("M")) {
            totalFrete += (valorEncomenda * 0.03);
        } else if (tamanho.equals("G")){
            totalFrete += (valorEncomenda * 0.05);
        } else {
            System.out.println("Insira um tamanho correto.");
        }

        return totalFrete;
    }

    void emitirEtiqueta() {
        Double totalCompra = calcularFrete() + valorEncomenda;
        System.out.println(String.format("""
                                        ***** ETIQUETA PARA ENVIO *****
                                        Endereço do remetente: %s
                                        Endereço do destinatário: %s
                                        Tamanho: %s
                                        --------------------------------------------------
                                        Valor encomenda: R$%.2f
                                        Valor frete: R$%.2f
                                        --------------------------------------------------
                                        Valor total: R$%.2f
                           """, enderecoRemetente, enderecoDestinatario,
                tamanho, valorEncomenda,
                calcularFrete(), totalCompra));
    }

}
