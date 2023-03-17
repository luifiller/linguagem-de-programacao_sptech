package com.mycompany.lista.introducao.poo;

/**
 *
 * @author luizn
 */
public class TesteEncomenda {

    public static void main(String[] args) {
        Encomenda encomenda01 = new Encomenda();
        encomenda01.tamanho = "P";
        encomenda01.enderecoRemetente = "Rua das Glórias, 200";
        encomenda01.enderecoDestinatario = "Avenida Qualquer, 89";
        encomenda01.valorEncomenda = 20.00;
        encomenda01.distancia = 30.00;
        encomenda01.emitirEtiqueta();

        Encomenda encomenda02 = new Encomenda();
        encomenda02.tamanho = "M";
        encomenda02.enderecoRemetente = "Rua Amendoim, 23";
        encomenda02.enderecoDestinatario = "Alameda Santos, 7";
        encomenda02.valorEncomenda = 35.00;
        encomenda02.distancia = 200.00;
        encomenda02.emitirEtiqueta();

        Encomenda encomenda03 = new Encomenda();
        encomenda03.tamanho = "G";
        encomenda03.enderecoRemetente = "Rua Ximbinha, 200";
        encomenda03.enderecoDestinatario = "Rua Carlos Augusto, 89";
        encomenda03.valorEncomenda = 40.00;
        encomenda03.distancia = 200.50;
        encomenda03.emitirEtiqueta();

    }

}
