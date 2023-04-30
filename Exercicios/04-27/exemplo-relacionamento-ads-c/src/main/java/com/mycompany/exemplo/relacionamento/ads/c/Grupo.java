/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.relacionamento.ads.c;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luifiller
 */
public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }

    public void adicionar(Contato c) {
        this.contatos.add(c);
    }

    public void remover(Contato c) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoAtual = contatos.get(i);
            if (contatoAtual.equals(c)) {
                this.contatos.remove(i);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return String.format("Grupo: \n"
                + "Nome do grupo: %s \n"
                + "Contatos: %s", this.nome, this.contatos);
    }

}
