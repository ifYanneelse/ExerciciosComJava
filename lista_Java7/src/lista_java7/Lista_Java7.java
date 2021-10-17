package lista_java7;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite a quantidade de funcionários: ");
        int nF = entrada.nextInt();
       
        int i;        
        double sal=0; double salExtra=0; double somaSalario=0;
        
        for (i=1; i<=nF; i++){
            System.out.println("\n Funcionario " + i);
            System.out.printf("Digite o número de horas trabalhadas: ");
            float nH = entrada.nextFloat();
            System.out.printf("Digite o salário por hora R$ ");
            float sH = entrada.nextFloat();

                if (nH <=40){
                    sal = nH * sH;
                    double valorHoraExtra=0;
                } else {
                    sal = 40 * sH;
                    double quantHoraExtra = nH - 40;
                    double valorHoraExtra = sH + (sH * 50) / 100;
                    salExtra = valorHoraExtra + quantHoraExtra;                
                } 
           
            double sB = sal + salExtra;
            System.out.println("Salário Bruto R$ " + sB + "\n");

            somaSalario+= sB;
        }
      
        //imprimindo
        System.out.println("- - - - - - - - - - - - - -\n");
        System.out.println("Total pago em salário R$ " + somaSalario + "\n");
    }
    
}