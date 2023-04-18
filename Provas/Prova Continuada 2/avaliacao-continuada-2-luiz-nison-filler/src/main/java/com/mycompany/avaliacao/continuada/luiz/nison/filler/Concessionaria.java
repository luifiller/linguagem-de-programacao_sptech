package com.mycompany.avaliacao.continuada.luiz.nison.filler;

/**
 *
 * @author luifiller
 */
public class Concessionaria {

    private String nome;
    private Integer quantidadeVendas;
    private Integer quantidadeDescontosAplicados;
    private Double totalVendido;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.quantidadeVendas = 0;
        this.quantidadeDescontosAplicados = 0;
        this.totalVendido = 0.0;
    }

    public void aumentarEstoque(Veiculo veiculo, Integer quantidade) {
        if (quantidade > 0) {
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque()
                    + quantidade);
            System.out.println(String.format("Estoque do modelo %s "
                    + "aumentado com sucesso.", veiculo.getModelo()));
        } else {
            System.out.println("Quantidade inválida. "
                    + "Insira um número maior que 0");
        }
    }

    public void realizarVenda(Veiculo veiculo) {
        Integer quantidadeAtualEstoque = veiculo.getQuantidadeEstoque();
        Double valorAtualTabela = veiculo.getValorTabela();

        if (quantidadeAtualEstoque > 0 && valorAtualTabela > 0) {
            veiculo.setQuantidadeEstoque(quantidadeAtualEstoque - 1);
            this.totalVendido += valorAtualTabela;
            this.quantidadeVendas++;

            System.out.println(String.format("Venda do modelo %s realizada com sucesso!"
                    + "\n------------------------------------------------------", veiculo.getModelo()));
        } else {
            if (quantidadeAtualEstoque <= 0) {
                System.out.println(String.format("Apenas pode vender o veículo "
                        + "de número %d, modelo %s, "
                        + "caso seu estoque atual for maior que 0."
                        + "\n------------------------------------------------------",
                        veiculo.getId(), veiculo.getModelo()));
            }

            if (valorAtualTabela <= 0) {
                System.out.println(String.format("Apenas pode vender o veículo "
                        + "de número %d, modelo %s, "
                        + "caso seu valor atual for maior que R$0.00."
                        + "\n------------------------------------------------------",
                        veiculo.getId(), veiculo.getModelo()));
            }
        }
    }

    public void realizarVenda(Veiculo veiculo, Double porcentagemDesconto) {
        Integer quantidadeAtualEstoque = veiculo.getQuantidadeEstoque();
        Double valorAtualTabela = veiculo.getValorTabela();

        if (quantidadeAtualEstoque > 0 && valorAtualTabela > 0 && porcentagemDesconto > 0.0) {
            veiculo.setQuantidadeEstoque(quantidadeAtualEstoque - 1);

            Double valorComDesconto = valorAtualTabela - (valorAtualTabela
                    * (porcentagemDesconto / 100));

            this.totalVendido += valorComDesconto;
            this.quantidadeVendas++;
            this.quantidadeDescontosAplicados++;

            System.out.println(String.format("Venda do modelo %s realizada com sucesso!"
                    + "\n------------------------------------------------------", veiculo.getModelo()));
        } else {
            if (quantidadeAtualEstoque <= 0) {
                System.out.println(String.format("Apenas pode vender o veículo "
                        + "de número %d, modelo %s, "
                        + "caso seu estoque atual for maior que 0."
                        + "\n------------------------------------------------------",
                        veiculo.getId(), veiculo.getModelo()));
            }

            if (valorAtualTabela <= 0) {
                System.out.println(String.format("Apenas pode vender o veículo "
                        + "de número %d, modelo %s, "
                        + "caso seu valor atual for maior que R$0.00."
                        + "\n------------------------------------------------------",
                        veiculo.getId(), veiculo.getModelo()));
            }
        }
    }

    public Double getPercentualVendasComDesconto() {
        Double quantidadeVendasConvertida = Double.valueOf(quantidadeVendas);

        Double descontos;
        if (quantidadeVendas.equals(0) || quantidadeDescontosAplicados.equals(0)) {
            descontos = 0.0;
        } else if (quantidadeVendas.equals(quantidadeDescontosAplicados)) {
            descontos = 100.0;
        } else {
            descontos = (this.quantidadeDescontosAplicados * 100.0) / quantidadeVendasConvertida;
        }

        return descontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(Integer quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public void setQuantidadeDescontosAplicados(Integer quantidadeDescontosAplicados) {
        this.quantidadeDescontosAplicados = quantidadeDescontosAplicados;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }

    @Override
    public String toString() {
        return String.format("Concessionaria: %s \n"
                + "Quantidade de vendas: %d \n"
                + "Quantidade de descontos aplicados: %d \n"
                + "Total vendido: R$%.2f",
                nome, quantidadeVendas, quantidadeDescontosAplicados,
                totalVendido);
    }

}
