package lista_java13;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double total = 0;
        double recibos = 0;
        String resp;        
        
        do {
            System.out.print("\nQuantas horas estacionado: ");
            int nHoras = entrada.nextInt();
            
            total = calcularTaxa(nHoras);  
            recibos += total;
                              
            System.out.print("\nDigite f para finalizar ou c para continuar: ");
            resp = entrada.next();
        } while (!resp.equalsIgnoreCase ("f"));
     
            imprimir(recibos);                    
    }           
    
    private static double calcularTaxa(int nHoras) {
        double total=0;
        
        if (nHoras<3){
            total = 2.00;                
        } else if (nHoras >= 3){
            int hExtra = nHoras - 3;
            double soma = hExtra * 0.50;
            total = 2.00 + soma;  
                if (total >= 10){
                    total = 10.00;                        
                }
            } 
        System.out.println("Taxa de estacionamento R$" + total);
        return total;
    }  
    
    private static void imprimir(double recibos){
        System.out.println("\n- - - - - - - - ");
        System.out.println("\nValor total dos recibos R$" + recibos);  
     }
             
}
