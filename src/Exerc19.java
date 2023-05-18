// Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, 
//digitado pelo usuário faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos. (utilize while)
import java.util.Scanner;
public class Exerc19 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o volume inicial em centímetros cúbicos");
        int Volume = input.nextInt();
        input.close();
    
        int segundos = 0;
        while(Volume<=1000) {
        Volume *= 2;
        segundos = segundos + 1;
        }
    System.out.printf("O volume chegou a 1000 centímetros cúbicos em %d segundos", segundos);

    }
    
}
