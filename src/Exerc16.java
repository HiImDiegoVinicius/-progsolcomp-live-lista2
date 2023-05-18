// Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
import java.util.Scanner;
public class Exerc16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int número;
        System.out.println("Digite um número menor que zero para sair: ");
        número  = input.nextInt();

       while(número >= 0) {
        System.out.printf("Número Ddigitado: %d" , número);
        System.out.println("Digite um número menor que zero para sair: ");
        número  = input.nextInt();
        
        
       }
       System.out.println("Programa encerrado");
       input.close();
    }
    
}
