package lista_java91;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java91 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int cont=0; int contA=0; int contB=0;
        int quant=0;
        float maiorA = 0; float maiorB = 0;
        String resp;
       
        do {
            System.out.printf("\nDigite o nome da inscrita: ");
            String nome = entrada.next();
            System.out.printf("Digite a altura em m: ");
            float altura = entrada.nextFloat();                

                cont=cont+1;
                                
                if (altura > maiorA) {
                    maiorB = maiorA;
                    maiorA = altura;
                    contA++;
                    }
                else if (altura > maiorB) {
                    maiorB = altura;
                    contB++;
                }
            
                quant=cont/(contA+contB);
                               
            System.out.print("\nDigite f para finalizar ou c para digitar outro nome: ");
            resp = entrada.next();
        } while (!resp.equalsIgnoreCase ("f"));

        
        System.out.println("\n - - - - - - - - - - - ");
        System.out.println (quant + " moça(s) possuem as 2 maiores alturas\n");
        System.out.println (" 1º____ " + maiorA + "\n");
        System.out.println (" 2º____" + maiorB);
    }
    
}
