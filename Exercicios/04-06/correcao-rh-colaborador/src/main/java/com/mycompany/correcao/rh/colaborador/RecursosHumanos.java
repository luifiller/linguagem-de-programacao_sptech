package com.mycompany.correcao.rh.colaborador;

/**
 *
 * @author luifiller
 */
public class RecursosHumanos {

    private Integer totalPromocoes;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromocoes = 0;
        this.totalSalariosReajustados = 0;
    }

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

    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "totalPromocoes=" + totalPromocoes + ", totalSalariosReajustados=" + totalSalariosReajustados + '}';
    }
    
    
}
