package lista_java11;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char tipo; char continua;
        tipo = 'r'; tipo = 'c'; tipo = 'i';
        float totalPagar, maiorCon, menorCon, totalR, totalC, totalI, mediaG;
        totalPagar=0; maiorCon=0; menorCon=0; totalR=0; totalC=0; totalI=0; mediaG=0;
        int cont=0;       
        
        do {
            System.out.print("\nDigite o número do consumidor: ");
            int nConsumidor = entrada.nextInt();
            System.out.print("Digite o preço do KWh consumido R$");
            float precoConsumido = entrada.nextInt();
            System.out.print("Quantidade de KWh consumidos no mês: ");
            float quantConsumido = entrada.nextInt();
            System.out.print("Tipo do consumidor: r=residencial | c=comercial | i=industrial\nTipo: ");
            tipo = entrada.next().charAt(0);

                if (quantConsumido > maiorCon) {
                    maiorCon=quantConsumido;                         
                } 
                if (quantConsumido<menorCon){
                    menorCon=quantConsumido;
                }

                switch (tipo){
                    case 'r': totalR += quantConsumido; break;  
                    case 'c': totalC += quantConsumido; break;  
                    case 'i': totalI += quantConsumido; break;  
                    default: System.out.println("Tipo inválido"); break;
                } 

            cont++;
            mediaG = (totalR+totalC+totalI)/cont;

            totalPagar = (quantConsumido * precoConsumido);        
            System.out.println("Consumidor " + nConsumidor + ". Total a pagar R$" + totalPagar);
            
            System.out.print("\nTecle 's' se deseja continuar ou 'n' para sair: ");
            continua = entrada.next().charAt(0);
        } while(continua == 's');     
        
        System.out.println("\n- - - - - - - - - - - ");
        System.out.println("Maior consumo..................: " + maiorCon + "\n" + 
                           "Menor consumo..................: " + menorCon + "\n" + 
                           "Total consumo tipo residencial.: " + totalR + "\n" + 
                           "Total consumo tipo comercial...: " + totalC + "\n" + 
                           "Total consumo tipo industrial..: " + totalI + "\n" + 
                           "Média geral de consumo.........: " + mediaG);
    }
    
}
