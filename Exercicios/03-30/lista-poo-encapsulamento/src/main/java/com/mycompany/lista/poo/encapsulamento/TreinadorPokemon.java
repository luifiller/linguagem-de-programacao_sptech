package com.mycompany.lista.poo.encapsulamento;

/**
 *
 * @author luifiller
 */
public class TreinadorPokemon {
    private String nomeTreinador;
    private Integer nivelTreinador;
    
    public void treinarPokemon(Pokemon pokemon, TreinadorPokemon treinador) {
        pokemon.setForcaPokemon(pokemon.getForcaPokemon() * 1.10);
        pokemon.setDocePokemon(pokemon.getDocePokemon() + 10);
        
        treinador.setNivelTreinador(treinador.getNivelTreinador() + 2);
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao, TreinadorPokemon treinador) {
        if (pokemon.getDocePokemon() >= 50) {
            
            System.out.println(String.format("""
                                             Pokémon %s evolui para -> %s
                                             """, pokemon.getNomePokemon(), nomeEvolucao)
            );
            
            pokemon.setNomePokemon(nomeEvolucao);
            pokemon.setDocePokemon(pokemon.getDocePokemon() - 50);
            treinador.setNivelTreinador(treinador.getNivelTreinador() + 10);
            
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public Integer getNivelTreinador() {
        return nivelTreinador;
    }

    public void setNivelTreinador(Integer nivelTreinador) {
        this.nivelTreinador = nivelTreinador;
    }    
    
}
