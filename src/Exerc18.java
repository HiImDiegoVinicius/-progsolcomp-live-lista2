//Faça um programa que determine o fatorial de um número. Para este problema, tem-se como entrada o valor do número do qual se deseja calcular o fatorial.
// O fatorial de 0 é igual a 1. O fatorial de um número N (N!) é definido conforme a seguir (utilize for): N! = 1 * 2 * 3 * 4 * ... * (N-1) * N 
import java.util.Scanner;
public class Exerc18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        input.close();
        int fatorial = 1;

        for (int i = 1; i <= numero; i = i + 1) {
            fatorial *= i;
        
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
    
}
