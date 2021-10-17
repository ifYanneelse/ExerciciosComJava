package lista_java12;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        double a = 0; double b = 0; double c = 0;
        int op = 0;
        
        do  {
            op=menu();
            switch (op) {
            case 1: 
                System.out.print("\nDigite o 1º valor: ");
                a = entrada.nextDouble();
                System.out.print("Digite o 2º valor: ");
                b = entrada.nextDouble();
                System.out.print("Digite o 3º valor: ");
                c = entrada.nextDouble();
                break;
            case 2: System.out.println("Àrea do trapézio: " + calcularTrapezio(a, b, c));
                break;
            case 3: System.out.println("Área do quadrado: "+ calcularQuadrado(b));
                break;
            case 4: System.out.println("Área do cubo: "+ calcularCubo(c)); 
                break;
            case 5: sair(); break;
            default: System.out.println("Tipo inválido"); break;
            }         
        } while(op != 5);
}

    private static int menu(){
        Scanner entrada = new Scanner(System.in);
        int op;      
    
        System.out.print("\nMenu:\n 1: Inserir os dados de entrada\n 2: Área do Trapézio\n 3: Área do Quadrado\n 4: Área da superfície do cubo\n 5: Sair\n Opção: ");
        op = entrada.nextInt();
       
        return op;
}        

    public static double calcularTrapezio(double a, double b, double c){        
        //double c;
        return ((a + b)/2)* c;      
}

    public static double calcularQuadrado(double b){  
        return Math.pow(b, 2); 
}

    public static double calcularCubo(double c){
        return 6 * (Math.pow(c, 2));
} 

    public static void sair(){
        System.out.println("Saindo..."); 
        System.exit(0);
} 
    
}