package lista_java3;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado 1: ");
        double a = entrada.nextInt();
        System.out.print("Digite o valor do lado 2: ");
        double b = entrada.nextInt();
        System.out.print("Digite o valor do lado 3: ");
        double c = entrada.nextInt();
        
        if ((a<b+c) && (b<a+c) && (c<a+b)){
            System.out.println("\nÉ um triângulo:");
            if ((a==b) && (b==c)){
                System.out.println("Equilátero");
            }
            else if ((a==b) || (a==c)){
                System.out.println("Isóscele");
            }
            else {
                System.out.println("Escaleno");
            }
        }
        else
            System.out.println("Isso NÃO é um triângulo");
        }

    }
