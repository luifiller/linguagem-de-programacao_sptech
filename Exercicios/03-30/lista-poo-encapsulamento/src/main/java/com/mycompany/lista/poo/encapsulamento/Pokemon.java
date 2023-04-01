package com.mycompany.lista.poo.encapsulamento;

/**
 *
 * @author luifiller
 */
public class Pokemon {
    private String nomePokemon;
    private String tipoPokemon;
    private Double forcaPokemon;
    private Integer docePokemon = 0;

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public Double getForcaPokemon() {
        return forcaPokemon;
    }

    public void setForcaPokemon(Double forcaPokemon) {
        this.forcaPokemon = forcaPokemon;
    }

    public Integer getDocePokemon() {
        return docePokemon;
    }

    public void setDocePokemon(Integer docePokemon) {
        this.docePokemon = docePokemon;
    }
    
    
    
}
