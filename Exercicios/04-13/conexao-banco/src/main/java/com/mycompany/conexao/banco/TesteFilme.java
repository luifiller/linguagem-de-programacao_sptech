package com.mycompany.conexao.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author luifiller
 */
public class TesteFilme {

    public static void main(String[] args) {
        Conexao conexao = new Conexao();

        JdbcTemplate con = conexao.getConnection();

        /*
            Todas as variáveis que representam atributos e que possuem mais de
            uma palavra, elas deverão ser separadas por underline (_)
         */
        con.execute("drop table if exists filme;");

        con.execute(
                "CREATE TABLE filme ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(45),"
                + "ano_lancamento int"
                + ");"
        );

        // Usa-se o "update" ao invés do "execute", pois ele retorna a quantidade de linhas afetadas
        con.update("insert into filme values (null, 'Sherk 2', 2012)");

        String nomeFilme = "Her";
        Integer anoLancamento = 2013;

        con.update(String.format("insert into filme values (null, '%s', %d)",
                nomeFilme, anoLancamento));

        Filme novoFilme = new Filme(null, "A volta", 2077);
        con.update(String.format("insert into filme values (null, '%s', %d)",
                novoFilme.getNome(), novoFilme.getAnoLancamento()));

        /*
            O BeanProperty não utiliza todo o constructor, 
            por isso precisa sobrecarregar o constructor com nenhum parâmetro.
         */
        List<Filme> filmes = con.query("select * from filme where ano_lancamento > 2013;",
                new BeanPropertyRowMapper(Filme.class));

        System.out.println(filmes);

//        con.update("update filme set nome = 'Sherk 4' where id=? and nome =?", 1, "Sherk 2'");
        con.update(String.format("update filme set nome = '%s' where id= %d and nome= '%s'", "Sherk 4", 1, "Sherk 2"));
        
        con.update(String.format("delete from filme where id = %d", 1));
        
        filmes = con.query("select * from filme;",
                new BeanPropertyRowMapper(Filme.class));

        System.out.println(filmes);

    }
}
