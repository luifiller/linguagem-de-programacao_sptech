package com.mycompany.avaliacao.continuada.luiz.nison.filler;

/**
 *
 * @author luifiller
 */
public class TesteConcessionaria {

    public static void main(String[] args) {
        Veiculo veiculo01 = new Veiculo(1, "Uno");
        Veiculo veiculo02 = new Veiculo(2, "Civic");

        Concessionaria conc = new Concessionaria("RappiCar");

        /*
            Abaixo, encontra-se uma situação correta, ou seja, não há nenhum retorno
            de insucesso nas ações da concessionaria e veículo.
        
            Foram realizadas outras duas situações, nas quais pode-se observar o retorno
            das tratativas de insucessos nas ações, por exemplo, da concessionaria.
            Para elas funcionarem, basta comentar esta primeira (linha 31 à 51) 
            e descomentar a desejada.
         */
        
        /*
            Simulando que chegaram duas "remessas" do mesmo veículo em momentos 
            diferentes, fazendo com que o atendente da concessionaria tivesse que
            aumentar o estoque do mesmo veículo duas vezes.
         */
        conc.aumentarEstoque(veiculo01, 3);
        conc.aumentarEstoque(veiculo01, 2);

        veiculo01.setValorTabela(1000.00);

        conc.aumentarEstoque(veiculo02, 3);
        veiculo02.setValorTabela(2500.00);

        System.out.println("--------------------Infos dos Veículos----------------------\n");
        System.out.println(veiculo01);
        System.out.println(veiculo02);

        System.out.println("--------------------Compras sem Desconto----------------------\n");
        conc.realizarVenda(veiculo01);
        conc.realizarVenda(veiculo02);
        conc.realizarVenda(veiculo02);

        System.out.println("--------------------Compras com Desconto----------------------\n");
        conc.realizarVenda(veiculo01, 10.0);
        conc.realizarVenda(veiculo01, 10.0);
        conc.realizarVenda(veiculo02, 30.0);

        
        /*
            Situação abaixo: vendas a mais do que o existente no estoque
            Basta comentar os códigos acima, os quais levam a uma situação de condições
            válidas; e descomentar os códigos abaixo (linha 58 à 82)
         */
//        conc.aumentarEstoque(veiculo01, 2);
//        conc.aumentarEstoque(veiculo02, 3);
//        veiculo01.setValorTabela(1000.00);
//        veiculo02.setValorTabela(2500.00);
//
//        System.out.println("--------------------Infos dos Veículos----------------------\n");
//
//        System.out.println(veiculo01);
//        System.out.println(veiculo02);
//
//        System.out.println("--------------------Compras sem Desconto----------------------\n");
//
//        conc.realizarVenda(veiculo01);
//        conc.realizarVenda(veiculo01);
//        conc.realizarVenda(veiculo01);
//
//        System.out.println("--------------------Compras com Desconto----------------------\n");
//
//        conc.realizarVenda(veiculo01, 10.0);
//        conc.realizarVenda(veiculo01, 10.0);
//
//        conc.realizarVenda(veiculo02, 10.0);
//        conc.realizarVenda(veiculo02, 15.0);
//        conc.realizarVenda(veiculo02, 10.0);
//        conc.realizarVenda(veiculo02, 20.0);


        /*
            Situação abaixo: vendas de veículo sem valores na tabela e sem estoque
            
            O vendedor achou que tinha já o veículo de id 1 em seu estoque, e tentou 
            vendê-lo. Por sorte há a validação e ele viu que é impossível vender,
            pois tanto não está disponível no estoque, como também
            não tem um valor definido ao veículo.

            Basta comentar os códigos acima,e descomentar os códigos abaixo (linha 96 à 118)
         */

//        conc.aumentarEstoque(veiculo02, 10);
//        veiculo02.setValorTabela(2500.00);
//
//        System.out.println("--------------------Infos dos Veículos----------------------\n");
//
//        System.out.println(veiculo01);
//        System.out.println(veiculo02);
//
//        System.out.println("--------------------Compras sem Desconto----------------------\n");
//
//        conc.realizarVenda(veiculo01);
//        conc.realizarVenda(veiculo01);
//        conc.realizarVenda(veiculo01);
//
//        System.out.println("--------------------Compras com Desconto----------------------\n");
//
//        conc.realizarVenda(veiculo01, 10.0);
//        conc.realizarVenda(veiculo01, 10.0);
//
//        conc.realizarVenda(veiculo02, 10.0);
//        conc.realizarVenda(veiculo02, 15.0);
//        conc.realizarVenda(veiculo02, 10.0);
//        conc.realizarVenda(veiculo02, 20.0);

        System.out.println("--------------------Fechamento da Concessionaria----------------------\n");
        System.out.println(conc);
        System.out.println(String.format("Percentual de vendas com desconto %.2f%%",
                conc.getPercentualVendasComDesconto()));
    }

}
