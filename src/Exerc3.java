//  Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.
import java.util.Scanner;
public class Exerc3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int a = input.nextInt();
    System.out.println("Digite outro número: ");
    input.close();
    int b = input.nextInt();
    if (a % b == 0 || b % a == 0) {
        System.out.println("São múltiplos");}
        else {System.out.println("Não são múltiplos");} 
    
    
    }

    }
    
