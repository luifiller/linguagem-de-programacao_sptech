package com.mycompany.correcao.rh.colaborador;

/**
 *
 * @author luifiller
 */
public class RecursosHumanos {

    private Integer totalPromocoes = 0;
    private Integer totalSalariosReajustados = 0;

    public void reajustarSalario(Colaborador colaborador, Double valorReajuste) {
        Double novoSalario = colaborador.getSalario() + valorReajuste;

        if (novoSalario > 0.0) {
            colaborador.setSalario(novoSalario);
            totalSalariosReajustados++;
            System.out.println("Salário reajustado!");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario > colaborador.getSalario() && !novoCargo.equals(colaborador.getCargo())) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromocoes++;
        } else {
            System.out.println("Operação inválida.");
        }
    }

    public void exibirColaborador(Colaborador colaborador) {
        System.out.println(String.format("Nome: %s \n"
                + "Cargo: %s \n"
                + "Salario: %.2f \n", colaborador.getName(), colaborador.getCargo(), colaborador.getSalario()));

    }

    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }
}
