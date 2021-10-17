package javaapplication15;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author YyY
 */
public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int consumo = 0; double media = 0; float somaQuilometros = 0;        
        String resp=" ";
        
        do {
            JOptionPane.showInputDialog("\nQuantos quilômetros foram dirigidos? ");
            int q = entrada.nextInt();
            JOptionPane.showInputDialog("Quantos litros de gasolina foram consumidos? ");
            int l = entrada.nextInt();             
              
            media = q/l;        
            consumo += l;
            somaQuilometros += q;
            
            System.out.print("\nDigite f para finalizar ou c para continuar: ");  
            resp = entrada.next();
        } while (!resp.equalsIgnoreCase ("f"));
        
        System.out.printf("\n------------------------------------ ");
        System.out.printf("\nQuilômetros por litro: " + media);
        System.out.printf("\nTotal de quilômetros rodados: " + somaQuilometros);
        System.out.printf("\nTotal de combustível consumido: " + consumo + "\n");
    }
    
}
