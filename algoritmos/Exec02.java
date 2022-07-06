/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.br.senac.algoritmos;

import java.util.Scanner;

/*

2. Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses números na tela.
Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.

*/

/**
 *
 * @author Rodrigo Amaral
 */

///* 
public class Exec02 {

    public static void main(String[] args) {
        //VARIAVEIS 

        Scanner ler = new Scanner(System.in);
        int valores[] = new int[5];

        int count = 0, soma = 0;

        System.out.println(".: Entrar 5 numeros Inteiros :.");

        do {
            System.out.println("Informe o valor" + (count + 1) + ": ");
            valores[count] = ler.nextInt();
            soma += valores[count];
            //AUTO INCREMENTO DA VARIAVEL
            count += 1;

        } while (count < 5);
        System.out.println("A soma dos valores é de: " + soma);
        System.out.println("Valores informador:");
        for (int i = 0; i < 5; i++) {

            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
            

        }

    }
}
