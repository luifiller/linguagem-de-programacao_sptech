package com.mycompany.heranca.agregacao;

/**
 *
 * @author luifiller
 */
public class TesteConsultoria {

    public static void main(String[] args) {
        Consultoria consultoria = new Consultoria("BRQ", 10);

        Desenvolvedor dev01 = new Desenvolvedor("Luiz", 60, 25.0);
        DesenvolvedorMobile dev02 = new DesenvolvedorMobile(40,
                35.0, "David", 60, 25.0);
        DesenvolvedorMobile dev03 = new DesenvolvedorMobile(45,
                35.0, "V", 62, 25.0);
        
        consultoria.contratar(dev01);
        consultoria.contratar(dev02);
        consultoria.contratar(dev03);
        
        System.out.println("-".repeat(40));
        
        System.out.println(String.format("Dados do dev. Luiz: %s", 
                consultoria.buscarDesenvolvedorPorNome("Luiz")));
        
        System.out.println("-".repeat(40));
        
        System.out.println(String.format("Existe o desenvolvedor? : %s", 
                consultoria.existePorNome("Pereira")));
        
        System.out.println("-".repeat(40));
        
        
        System.out.println(String.format("Quantidade de devs: %d", 
                consultoria.getQuantidadeDesenvolvedores()));
        
        System.out.println("-".repeat(40));
        
        System.out.println(String.format("Quantidade de devs mobile: %d", 
                consultoria.getQuantidadeDesenvolvedoresMobile()));
        
        System.out.println("-".repeat(40));
        
        System.out.println(String.format("Total dos salários: R$%.2f", 
                consultoria.getTotalSalarios()));
        
        System.out.println(consultoria);
    
        System.out.println("-".repeat(40));
    }

}
