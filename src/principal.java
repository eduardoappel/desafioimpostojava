import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    
    System.out.println("\nDESAFIO: Imposto Java");

    // Declaração e inicialização das váriaveis
    double salarioAnual = 0.0;
    double prestacaoServicoAnual = 0.0;
    double ganhoCapitalAnual = 0.0;
    double gastosMedico = 0.0;
    double gastosEducacional = 0.0;
    
    double salarioMensal = 0.0;

    double impostoSobreSalario = 0.0;
    double impostoSobreServico = 0.0;
    double impostoGanhoCapital = 0.0;

    double impostoBruto = 0.0;
    double limiteDeducao = 0.0;
    double gastosTotais = 0.0;
    double deducaoPermitida = 0.0;

    double impostoDevido = 0.0;

    // Entrada das informações/dados
    Scanner sc = new Scanner(System.in);

    System.out.println("\nINFORME OS SEUS RENDIMENTOS PARA O IMPOSTO DE RENDA");
    System.out.print("Informe a Renda anual com salário: ");
    salarioAnual = sc.nextDouble();
    System.out.print("Informe a Renda anual com a Prestação Serviços: ");
    prestacaoServicoAnual = sc.nextDouble();
    System.out.print("Informe a Renda anual com Ganho de Capital: ");
    ganhoCapitalAnual = sc.nextDouble();
    
    System.out.println("INFORME OS SEUS GASTOS PARA O IMPOSTO DE RENDA");
    System.out.print("Informe os Gastos médico: ");
    gastosMedico = sc.nextDouble();
    System.out.print("Informe os Gastos Esducacionais: ");
    gastosEducacional = sc.nextDouble();

    // Cálculo do salário mensal
    salarioMensal = salarioAnual / 12;

    // Cálculo do imposto sobre o salário
    if(salarioMensal >= 3000.0 && salarioMensal < 5000.0) {
        impostoSobreSalario = salarioAnual *0.10;
    }
    else if(salarioMensal >= 5000.0){
        impostoSobreSalario = salarioAnual *0.20;
    }

    // Cálculo dos impostos sobre outras rendas
    impostoSobreServico = prestacaoServicoAnual * 0.15;
    impostoGanhoCapital = ganhoCapitalAnual * 0.20;

    // Cálculo do imposto bruto devido
    impostoBruto = impostoSobreSalario + impostoSobreServico + impostoGanhoCapital;

     // Cálculo da dedução
     limiteDeducao = impostoBruto * 0.30;
     gastosTotais = gastosMedico + gastosEducacional;
     deducaoPermitida = Math.min(gastosTotais, limiteDeducao);

    // Cálculo do imposto devido
    impostoDevido = impostoBruto - deducaoPermitida;  
    
    // Relatório de imposto de renda
    System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA");
    System.out.println("\nCONSOLIDADO DE RENDA");

    System.out.printf("Imposto sobre salário: %.2f%n", impostoSobreSalario);   
    System.out.printf("Imposto sobre serviços: %.2f%n", impostoSobreServico);
    System.out.printf("Imposto sobre ganho de capital:  %.2f%n", impostoGanhoCapital);

    System.out.println("\nDEDUÇÕES");
    System.out.printf("Máximo dedutível:  %.2f%n", limiteDeducao);
    System.out.printf("Gastos dedutíveis: %.2f%n", gastosTotais);

    System.out.println("\nRESUMO"); 
    System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
    System.out.printf("Abatimento: %.2f%n", deducaoPermitida);
    System.out.printf("Imposto devido: %.2f%n", impostoDevido);
    
    sc.close();    

    }

}
