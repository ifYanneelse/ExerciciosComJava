package lista_java1;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java1 {

    public static void main(String[] args) {
              
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = entrada.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = entrada.nextInt();
        
        int maior;
        int menor;

        if (n1>n2 && n1>n3) {
            maior=n1;
        } else if (n2>n1 && n2>n3) {
            maior=n2;
        } else {
            maior=n3;
        }

        if (n1<n2 && n1<n3) {
            menor=n1;
        } else if (n2<n1 && n2<n3) {
            menor=n2;
        } else {
            menor=n3;
        }
        
        //imprimindo
        System.out.println(" - - - - - - - - - - - ");
        System.out.println("Soma: " + (n1 + n2 + n3));
        System.out.println("Média: " + (n1 + n2 + n3) / 3);
        System.out.println("Produto: " + (n1 * n2 * n3));
        System.out.println ("Maior número: " + maior + "\n" + "Menor número: " + menor);
    }   
}
