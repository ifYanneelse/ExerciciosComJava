package lista_java14;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float valorGasto = 0;
        float valor=0;
        int op = 0;
        String resp; 
               
        do  {
            System.out.print("\nDigite o valor total gasto R$");
            valorGasto = entrada.nextFloat();  
            
            op=menu();        
            
            switch (op) {
            case 1: 
                System.out.println("\nValor a ser pago R$" + calcularVista(valorGasto));
                break;
            case 2: System.out.println("\n2 prestações de R$"+ calcular2Vezes(valorGasto));
                break;
            case 3: System.out.println("\nValor a ser pago a cada parcela R$" + calcularAcima(valorGasto));
                break;
            case 4: sair(); break;
            default: System.out.println("\nTipo inválido"); break;
            }
                
            System.out.print("\nDigite f para finalizar ou c para continuar: ");
            resp = entrada.next();
        } while (!resp.equalsIgnoreCase ("f"));        
}
        
    
    private static int menu(){
        Scanner entrada = new Scanner(System.in);
        int op;      
    
        System.out.print("\nOpções de pagamento:\n 1: a vista com 10% de desconto\n 2: em duas vezes \n 3: de 3 até 10 vezes com 3% de juros ao mês \n 4: Sair\n Opção: ");
        op = entrada.nextInt();
       
        return op;
    }
    
    public static double calcularVista(float valor){ 
        float desconto = (valor * 10)/100;
        return valor - desconto;
    }
    
    public static double calcular2Vezes(float valor){  
        return valor / 2;
    }
    
    public static double calcularAcima(float valor){  
        Scanner entrada = new Scanner(System.in);
        int parcelas=0;
        float valorParcelas;
        int valorGasto = 0;
        
        if(valorGasto >= 100);
        
        do {
            System.out.print("\nQuantas parcelas? (3 até 10 vezes): ");
            parcelas = entrada.nextInt();            
        } while ((parcelas <= 3) || (parcelas >= 10));
        valorParcelas = (float) (valor * ((parcelas * 0.03) + 1));
        
        return valorParcelas/parcelas; 
    }
    
    public static void sair(){
        System.out.println("Saindo..."); 
        System.exit(0);
    } 
    
}
