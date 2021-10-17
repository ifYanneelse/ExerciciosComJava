package lista_java4;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o índice de poluição: ");
        double i = entrada.nextDouble();
        System.out.print("\nNOTIFICAÇÃO\n");
        if (i>=0.0&&i<=0.25){
            System.out.println("índice de poluição aceitável");
        } else if (i>=0.3){
            System.out.println("Suspender atividades 1º grupo");
        } else if (i>=0.4){
            System.out.println("Suspender atividades 1º e 2º grupo");
        } else {
            System.out.println("Todos os grupos devem paralisar as atividades");
        }
    }
}
