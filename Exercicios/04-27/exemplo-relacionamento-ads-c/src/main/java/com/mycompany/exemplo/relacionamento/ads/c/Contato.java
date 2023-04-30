package com.mycompany.exemplo.relacionamento.ads.c;

/**
 *
 * @author luifiller
 */
public class Contato {

    private String nome;
    private String telefone;
    private Boolean isBloquado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.isBloquado = false;
    }

    public void bloquear() {
        this.isBloquado = true;
    }

    public void desbloquear() {
        this.isBloquado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getIsBloquado() {
        return isBloquado;
    }

    @Override
    public String toString() {

        return String.format("Contato: \n"
                + "Nome: %s \n"
                + "Telefone: %s \n"
                + "É Bloqueado: %s \n",
                this.nome, this.telefone, (isBloquado ? "Sim" : "Não"));
    }

}
