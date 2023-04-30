package com.mycompany.exemplo.relacionamento.ads.c.carrinho;

/**
 *
 * @author luifiller
 */
public class Produto {

    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoria, Double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: \n"
                + "Nome: %s \n"
                + "Categoria: %s \n"
                + "Preço: R$%.2f",
                this.nome, this.categoria, this.preco);
    }

}
