/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.senac.algoritmos;

import java.util.Scanner;

/*

3. Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que exiba a lista desses nomes na tela.
Após exibir essa lista, o programa deve mostrar também os nomes na ordem inversa em que o usuário os digitou, um por linha.

 */
/**
 *
 * @author Rodrigo Amaral
 */
public class Exec03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nomes[] = new String[5];

        int count = 0;

        System.out.println(" .: Informe 5 nomes :. ");

        do {
            System.out.println("Entre com " + (count + 1) + " º nome: ");
            nomes[count] = ler.next();
            count++;
        } while (count < 5);
        System.out.println("\n .: Lista de Nomes :.");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "º nome: " + nomes[i]);
        }

        System.out.println("\n .: Lista de Nomes em ordem Inversa :.");

        for (int i = 4; i >= 0; --i) {

            System.out.println((i + 1) + " º nome: " + nomes[i]);

        }

    }

}
