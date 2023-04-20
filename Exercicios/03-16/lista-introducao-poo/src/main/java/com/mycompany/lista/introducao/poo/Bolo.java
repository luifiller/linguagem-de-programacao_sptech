package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;

    public void comprarBolo(Integer quantidadeDesejada) {
        Integer quantidadeTotal = quantidadeVendida + quantidadeDesejada;
        
        if (quantidadeTotal > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        } else {
            quantidadeVendida = quantidadeTotal;
        }
    }
    
    public void exibirRelatorio() {
        Double dinheiroTotalRecebido = quantidadeVendida * valor;
        System.out.println(String.format("O bolo sabor %s, foi "
                + "comprado %d vezes hoje, totalizando R$%.2f", sabor,
                quantidadeVendida, dinheiroTotalRecebido));
    }

}
