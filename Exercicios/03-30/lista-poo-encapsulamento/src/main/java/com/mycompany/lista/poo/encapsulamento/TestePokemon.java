package com.mycompany.lista.poo.encapsulamento;

/**
 *
 * @author luifiller
 */
public class TestePokemon {

    public static void main(String[] args) {
        Pokemon pokemon01 = new Pokemon();
        pokemon01.setNomePokemon("Geraldo");
        pokemon01.setTipoPokemon("Folha");
        pokemon01.setDocePokemon(10);
        pokemon01.setForcaPokemon(100.00);

        Pokemon pokemon02 = new Pokemon();
        pokemon02.setNomePokemon("Geraldina");
        pokemon02.setTipoPokemon("Água");
        pokemon02.setDocePokemon(5);
        pokemon02.setForcaPokemon(20.00);

        TreinadorPokemon treinador01 = new TreinadorPokemon();
        treinador01.setNomeTreinador("Everaldo");
        treinador01.setNivelTreinador(1);
        
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);
        treinador01.treinarPokemon(pokemon01, treinador01);

        System.out.println(String.format("""
                                         -------------------------------
                                         Nome: %s
                                         Tipo: %s
                                         Quantidade doce: %d
                                         Quantidade força: %.2f
                                         -------------------------------
                                         """, pokemon01.getNomePokemon(), 
                                         pokemon01.getTipoPokemon(),
                                         pokemon01.getDocePokemon(),
                                         pokemon01.getForcaPokemon())
        );
        
        treinador01.evoluirPokemon(pokemon01, "Geraldão", treinador01);
        
        System.out.println(String.format("""
                                         -------------------------------
                                         Nome: %s
                                         Tipo: %s
                                         Quantidade doce: %d
                                         Quantidade força: %.2f
                                         -------------------------------
                                         """, pokemon01.getNomePokemon(), 
                                         pokemon01.getTipoPokemon(),
                                         pokemon01.getDocePokemon(),
                                         pokemon01.getForcaPokemon())
        );
        
        treinador01.treinarPokemon(pokemon02, treinador01);
        treinador01.treinarPokemon(pokemon02, treinador01);
        
        System.out.println(String.format("""
                                         -------------------------------
                                         Nome: %s
                                         Tipo: %s
                                         Quantidade doce: %d
                                         Quantidade força: %.2f
                                         -------------------------------
                                         """, pokemon02.getNomePokemon(), 
                                         pokemon02.getTipoPokemon(),
                                         pokemon02.getDocePokemon(),
                                         pokemon02.getForcaPokemon())
        );
        
        treinador01.evoluirPokemon(pokemon02, "Geraldinona", treinador01);
        
        System.out.println(String.format("""
                                         -------------------------------
                                         Nome treinador: %s
                                         Nível treinador: %d
                                         -------------------------------
                                         """, treinador01.getNomeTreinador(),
                                         treinador01.getNivelTreinador())
        );
        
        
    }
}
