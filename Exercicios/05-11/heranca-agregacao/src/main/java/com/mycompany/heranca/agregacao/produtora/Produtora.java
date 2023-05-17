package com.mycompany.heranca.agregacao.produtora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome) {
        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).nome.equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void contratar(Ator a) {
        if (this.existePorNome(nome)) {
            System.out.println("Esse desenvolvedor já está contratado conosco.");
        } else if (this.vagas.equals(0)) {
            System.out.println("Sem vagas disponíveis.");
        } else {
            atores.add(a);

            System.out.println("Desenvolvedor contratado.");

            this.vagas--;
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        return atores.size();
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer count = 0;

        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i) instanceof Protagonista) {
                count++;
            }
        }

        return count;
    }

    public Double getTotalSalarios() {
        Double totalSalarios = 0.0;

        for (int i = 0; i < atores.size(); i++) {
            totalSalarios += atores.get(i).getSalario();
        }

        return totalSalarios;
    }

    public Ator buscarAtorPorNome(String nome) {
        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).nome.equalsIgnoreCase(nome)) {
                return atores.get(i);
            }
        }

        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return String.format("""
                             ---------------------------- \n
                             |        Produtora       | \n
                             ---------------------------- \n
                             Nome: %s \n
                             Total de vagas: %d \n
                             Todos atores: %s \n
                             ----------------------------
                             """, this.nome, this.vagas, this.atores);
    }

}
