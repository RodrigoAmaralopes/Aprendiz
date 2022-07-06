/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.senac.algoritmos;

import java.util.Scanner;

/*
5. Crie um programa que armazene 10 números digitados pelo usuário em dois vetores: um somente para números pares, e outro somente para números ímpares.
Após, exiba os valores dos dois vetores na tela, em sequência.
Obs.: As posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto
 */
/**
 *
 * @author Rodrigo Amaral
 */
public class Exec05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int valores[][] = new int[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Entre com o " + (i + 1) + "º números: ");
            int valor = ler.nextInt();
            if (valor % 2 == 0) {

                //par
                valores[i][0] = valor; //par
                valores[i][1] = 0; // impar

            } else {

                
                valores[i][0] = 0; // par
                valores[i][1] = valor; //impar
            }
            
            
            System.out.println("\n .: Lista de Valores :.");

        }

    }
}
