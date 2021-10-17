package lista_java2;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java2 {

    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio: ");
        double r = entrada.nextInt();
       
        double d = 2 * r;
        double c = (2 * Math.PI) * r;
        double a = Math.PI * (Math.pow(r,2));
        
        //imprimindo
        System.out.println(" - - - - - - - - - - - ");
        System.out.println("Diâmetro: " + d);
        System.out.println("Circunferência: " + c);
        System.out.println("Área: " + a);
        
    }
    
}