package com.mycompany.empresa.mateus.resende;

/**
 *
 * @author luifiller
 */
public class TesteEmpresa {

    public static void main(String[] args) {
        Empresa emp = new Empresa("BRQ", 1500.00, 5);

        Desenvolvedor dev01 = new Desenvolvedor(20.00,
                50.00, 10, "Luiz",
                "01923109821", 22, 1800.00);

        Desenvolvedor dev02 = new Desenvolvedor(15.00, 35.00,
                3, "Pedro", "01923109821",
                22, 1300.00);

        Gestor gest01 = new Gestor(12, 80.00,
                50.00, "Gerson", "90901920931",
                22, 5000.00);

        System.out.println("Antes contratação: \n" + emp);
        
        emp.contratarFuncionario(dev01);
        emp.contratarFuncionario(dev02);
        emp.contratarFuncionario(gest01);

        System.out.println("Após contratações: \n" + emp);
        
        emp.investirCapital(1200.00);
        emp.demitirFuncionario(dev02);
        
        System.out.println("Após demissão: \n" + emp);

        System.out.println(emp.toString());
        
        
        
    }
}
