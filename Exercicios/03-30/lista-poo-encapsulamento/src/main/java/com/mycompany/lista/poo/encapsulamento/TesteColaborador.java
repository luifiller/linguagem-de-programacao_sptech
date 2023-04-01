package com.mycompany.lista.poo.encapsulamento;

/**
 *
 * @author luifiller
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador();
        Colaborador colab02 = new Colaborador();

        RecursosHumanos rh = new RecursosHumanos();

        colab01.setNomeColaborador("Luiz");
        colab01.setCargoColaborador("Estagiário front-end");
        colab01.setSalarioColaborador(2500.00);

        colab02.setNomeColaborador("João");
        colab02.setCargoColaborador("DBA");
        colab02.setSalarioColaborador(3200.00);

        System.out.println(String.format(
                """
                ----------------------------------
                |   Informações do colaborador   |
                ----------------------------------
                Nome: %s                       
                Cargo: %s                      
                Salario: R$%.2f                 
                """,
                colab01.getNomeColaborador(), colab01.getCargoColaborador(), colab01.getSalarioColaborador())
        );

        System.out.println(String.format(
                """
                ----------------------------------
                |   Informações do colaborador   |
                ----------------------------------
                Nome: %s                       
                Cargo: %s                      
                Salario: R$%.2f                 
                """,
                colab02.getNomeColaborador(), colab02.getCargoColaborador(), colab02.getSalarioColaborador())
        );

        rh.promoverColaborador(colab01, "Desenvolvedor front-end Júnior ", 2900.00);
        rh.promoverColaborador(colab02, "Designer UX/UI", 2600.00);

        System.out.println(String.format(
                """
                ----------------------------------
                |   Informações do colaborador   |
                ----------------------------------
                Nome: %s                       
                Cargo: %s                      
                Salario: R$%.2f                 
                """,
                colab01.getNomeColaborador(), colab01.getCargoColaborador(), colab01.getSalarioColaborador())
        );

        System.out.println(String.format(
                """
                ----------------------------------
                |   Informações do colaborador   |
                ----------------------------------
                Nome: %s                       
                Cargo: %s                      
                Salario: R$%.2f                 
                """,
                colab02.getNomeColaborador(), colab02.getCargoColaborador(), colab02.getSalarioColaborador())
        );

        rh.reajustarSalario(colab01, 150.00);

        System.out.println(String.format(
                """
                ----------------------------------
                |   Informações do colaborador   |
                ----------------------------------
                Nome: %s                       
                Cargo: %s                      
                Salario: R$%.2f                 
                """,
                colab01.getNomeColaborador(), colab01.getCargoColaborador(), colab01.getSalarioColaborador())
        );

        System.out.println(String.format(
                """
                ----------------------------------
                |          Métricas RH           |
                ----------------------------------
                Total de promovidos: %d
                Total de reajustes: %d
                           """,
                rh.getPromovidos(), rh.getTotalSalariosReajustados()));
    }
}
