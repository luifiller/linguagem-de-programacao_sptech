package com.mycompany.exemplo.heranca.ads.c;

/**
 *
 * @author luifiller
 */

// Superclasse
public class Aluno {
    protected String nome;
    protected String ra;
    protected Double nota01;
    protected Double nota02;

    public Aluno(String nome, String ra, Double nota01, Double nota02) {
        this.nome = nome;
        this.ra = ra;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }
    
    public Double calcularMedia() {
        return (this.nota01 + this.nota02) / 2.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Double getNota01() {
        return nota01;
    }

    public void setNota01(Double nota01) {
        this.nota01 = nota01;
    }

    public Double getNota02() {
        return nota02;
    }

    public void setNota02(Double nota02) {
        this.nota02 = nota02;
    }

    @Override
    public String toString() {
        return String.format("Aluno: \n"
                + "Nome: %s \n"
                + "RA: %s \n"
                + "Nota 01: %.1f \n"
                + "Nota 02: %.1f", this.nome, this.ra, 
                this.nota01, this.nota02);
    }
    
}
