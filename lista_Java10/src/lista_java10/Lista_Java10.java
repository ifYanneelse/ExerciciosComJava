/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_java10;

import java.util.Scanner;

/**
 *
 * @author YyY
 */
public class Lista_Java10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalCandidatos  = 0;
        float maiorCandidatos = 0; float maiorCodigo = 0;
        char continua;
              
        do {
            System.out.print("\nDigite o código do curso.............: ");
            int codigo = entrada.nextInt();
            System.out.print("Digite o número de vagas...............: ");
            int nVagas = entrada.nextInt();
            System.out.print("Número de candidatos do sexo masculino.: ");
            int quantM = entrada.nextInt();
            System.out.print("Número de candidatos do sexo feminino...: ");
            int quantF = entrada.nextInt();

            int somarQuant = quantF+quantM;
            float candidatosVaga = somarQuant/nVagas;
            float porcF = ((quantF*100)/(quantM+quantF));

            System.out.println("\n- - - - - - - - - - - ");
            System.out.println("Código do curso.......................: " + codigo);
            System.out.println("Candidatos por vaga...................: " + candidatosVaga);
            System.out.println(porcF + "% de candidatos do sexo feminino.\n");

                if (candidatosVaga > maiorCandidatos) {
                    maiorCandidatos=candidatosVaga; 
                    maiorCodigo=codigo;
                } 

            totalCandidatos = totalCandidatos + somarQuant;

            System.out.print("Tecle 's' se deseja continuar: ");
            continua = entrada.next().charAt(0);
        } while(continua == 's');
                
        System.out.println("\n- - - - - - - - - - - ");
        System.out.println("O maior número de candidatos por vaga é " + maiorCandidatos +
                " no curso do código " + maiorCodigo);
        System.out.println("Total de candidatos........................: " + totalCandidatos);
    }
    
}
