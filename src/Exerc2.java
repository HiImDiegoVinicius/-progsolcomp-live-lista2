//Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente
import java.util.Scanner;
public class Exerc2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numero1 = input.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        System.out.println("Digite mais um número: ");
        int numero3 = input.nextInt();
        input.close();
        if (numero1 <= numero2 && numero1 <= numero3 ) {
         if (numero2 <= numero3 ) { 
            System.out.printf("A ordem crescente dos números digitados são: %d, %d e %d",numero1, numero2, numero3);}
        
        else {System.out.printf("A ordem crescente dos números digitados são: %d, %d e %d",numero1, numero3, numero2);} 
        
          } else if (numero2 <= numero1 && numero2 <= numero3){
             if (numero1 <= numero3) {System.out.printf("A ordem crescente dos números digitados são: %d, %d e %d",numero2 , numero1 , numero3);}
             else {System.out.printf("A ordem crescente dos números digitados são: %d, %d e %d",numero2 , numero3 , numero1);}
          } else if (numero3 <= numero2 && numero3 <= numero1) {
             if ( numero1 <= numero2) {System.out.printf("A ordem crescente dos números digitados são: %d, %d e %d",numero3 , numero1 , numero2);}
                else {System.out.printf("A ordem crescente dos números digitados são: %d, %d e %d",numero3 , numero2 , numero1);}
          }
        }
    }
            
        

            