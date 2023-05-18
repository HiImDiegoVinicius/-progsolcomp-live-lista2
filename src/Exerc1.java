//Nome: Diego Vinicius de Sousa Azevedo
//RA:323134807
//Nome do programa: Faça um programa que leia dois números A e B e imprima o maior deles.
//Data: 12/05/2023

import java.util.Scanner;
public class Exerc1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numero1 = input.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        input.close();
        if (numero1 > numero2) {
            System.out.printf("O maior número é: %d", numero1 );
         } else {
                System.out.printf("O maior número é: %d", numero2 );
            
        }
    }
}
