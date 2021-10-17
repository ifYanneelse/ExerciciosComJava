package lista_java8;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java8 {

    public static void main(String[] args) {
              
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite a quantidade de mercadorias: ");
        int nM = entrada.nextInt();
        
        int i;            
        float lucro, lucros;
        float menos10 = 0; float menos20 = 0; float mais20 = 0;
        double valorTotalVenda = 0; double valorTotalCompra = 0; double valorLucroTotal = 0;
        
        for (i=1; i<=nM; i++){
            System.out.printf("\nNome do Produto: ");
            String nomeProduto = entrada.next();      
            System.out.printf("Preço da compra R$ ");
            float precoCompra = entrada.nextFloat();
            System.out.printf("Preço de venda R$ ");
            float precoVenda = entrada.nextFloat();

            lucro = precoVenda - precoCompra;
            lucros = lucro/precoCompra * 100;

                if (lucros <0.1){
                   menos10 = menos10 + 1;
                } else if ((lucros>=0.1)&&(lucros<=0.2)){
                   menos20 = menos20 +1;
                } else {
                   mais20 =  mais20 + 1;
                }

            valorTotalCompra+=precoCompra;
            valorTotalVenda+=precoVenda;
            valorLucroTotal+=lucro;
              
        }
               
        System.out.println("\n- - - - - - - - - - - ");
        System.out.println(menos10 + " produtos com lucro menor que 10%");
        System.out.println(menos20 + " produtos com lucro entre 10% e 20%");
        System.out.println(mais20 + " produtos com lucro maior que 20%");
        System.out.println("Valor total da compra R$" + valorTotalCompra);
        System.out.println("Valor total da venda R$" + valorTotalVenda);
        System.out.println("Lucro de " + valorLucroTotal + "% \n");              
    }
    
}
