// Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo. 
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int a = input.nextInt();
        input.close();
        if (a % 2 == 0) {
            System.out.println("Número par");}
            else {System.out.println("Número impar");}
         if (a < 0) {System.out.println("Negativo");}
        else {System.out.println("Número positivo");}
        }
   
}

    

