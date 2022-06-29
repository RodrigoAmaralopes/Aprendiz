/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

@AUTHOR Rodrigo Amaral 

//
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author 182110091
 */
//1- Desenvolva uma algoritmo, que guarde as informações de 15 alunos Nome, n1, n2, n3, media:

public class Exec01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nAlunos, nNotas;
        
        System.out.println("informe o número de alunos: ");
        nAlunos = ler.nextInt();
        System.out.println("Informe número de Notas: ");
        nNotas = ler.nextInt();
       
        
        
         
        //cria matriz de notas
        float[][] notas = new float[nAlunos][(nNotas +1)];

        //Criar vetor para nomes alunos
        String[] alunos = new String[nAlunos];

        System.out.println(" . : Notas de Alunos : .");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Nome do Aluno " + (i + 1) + ": ");

            alunos[i] = ler.next();
            System.out.println("\n  |Notas|");
            for (int j = 0; j < nNotas; j++) {
                System.out.println("\n Nota " + (j + 1) + ": ");
                notas[i][j] = ler.nextFloat();
                
                //FAZ SOMA DE TODAS AS NOTAS
                notas[i] [(nNotas )] += notas[i][j];

            }
            //media
            notas[i][(nNotas)] = notas [i] [(nNotas)]  / nNotas;

        }
        
        System.out.println("\n  . : Impressão :  .\n");

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("\n Aluno " + (i+1) + ":  " + alunos[i] );
            for (int j = 0; j < nNotas; j++) {
                System.out.println("\n Aluno " + (i+1) +": " +notas[i][j] );
                
            }
            
            System.out.println(" - Média: " +notas[i][nNotas -1]);
            System.out.println("-----");
        }
    }

}
