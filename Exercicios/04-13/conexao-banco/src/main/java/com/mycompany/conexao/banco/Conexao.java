package com.mycompany.conexao.banco;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author luifiller
 */
public class Conexao {

    private final JdbcTemplate connection;

    public Conexao() {
        // é um objeto do DBCP2 que facilita a coneão
        BasicDataSource dataSource = new BasicDataSource();

        /*
            Nome da classe do driver no BD
            Terá que mudar a depender do BD que estiver querendo se conectar
        */
        dataSource​.setDriverClassName(
                "org.h2.Driver");
        
        // Como padrão é utilizada a porta 3306
        dataSource.setUrl("");
        

        /*
            O H2 é um dile, por isso tem o file
            com o file será criado um arquivo com o nome do banco, no caso "banco_teste"
        */ 
        dataSource​.setUrl(
                "jdbc:h2:file:./banco_teste");

        /*
            Ao invés de declarar o username e a passwd no script aqui,
            será criada variável de ambiente na máquina e, com isso/ela,
            será declarada nesse script
        */
        dataSource​.setUsername(
                "sa");
        
        dataSource​.setPassword(
                "");

        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }

}
