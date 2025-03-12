import java.util.Locale;
import java.util.Scanner;

public class principal {

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
    
    

    }

}
