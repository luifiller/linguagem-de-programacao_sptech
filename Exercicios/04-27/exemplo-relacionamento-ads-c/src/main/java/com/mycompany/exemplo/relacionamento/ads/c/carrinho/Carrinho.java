package com.mycompany.exemplo.relacionamento.ads.c.carrinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class Carrinho {
    private String cliente;
    private List<Produto> produtos;
    
    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }
    
    public Integer getQuantiddade() {
        return this.produtos.size();
    }
    
    public void adicionar(Produto p) {
        this.produtos.add(p);
    }
    
    public Boolean existsPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return true;
            }
        }
        
        return false;
    }
    
    public Integer getQuantidadePorCategoria(String nome) {
        Integer cont = 0;
        
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equals(nome)) {
                cont ++;
            }
        }
        
        return cont;
    }
    
    public void limpar() {
        for (int i = 0; i < produtos.size(); i++) {
            produtos.remove(i);
        }
    }
    
    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
            }
        }
    }
    
    public Produto getPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                return produtos.get(i);
            }
        }
        
        return null;
    }
    
    public Double getValorTotal() {
        Double valorTotal = 0.0;
        
        for (int i = 0; i < produtos.size(); i++) {
            valorTotal += produtos.get(i).getPreco();
        }
        
        return valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return String.format("Carrinho: \n"
                + "Cliente: %s \n"
                + "Produtos %s", 
                this.cliente, this.produtos);
    }
    
    
}
