package com.mycompany.avaliacao.continuada3.luiz.nison;

/**
 *
 * @author luifiller
 */
public class TesteEscolaVirtual {

    public static void main(String[] args) {
        EscolaVirtual escola01 = new EscolaVirtual("SPTECH", 4);

        Professor prof01 = new Professor("Frizza", "Análise de Sistemas",
                1400.00, 5);

        Professor prof02 = new Professor("Mônica", "Tecnologia da Informação",
                1200.00, 8);

        Palestrante palestrante01 = new Palestrante(10, 60.00, ""
                + "Luiz", "Psicologia", 2000.00, 7);

        escola01.contratarProfessor(prof01);
        escola01.contratarProfessor(prof02);
        escola01.contratarProfessor(palestrante01);

        escola01.exibeFolhaDePagamento();

        escola01.exibirTodos();

        escola01.exibePalestrante();

        escola01.buscarProfessor("Luiz");
        escola01.buscarProfessor("Paulo");
    }
}
