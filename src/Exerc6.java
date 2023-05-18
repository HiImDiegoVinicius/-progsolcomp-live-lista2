//  Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de 0 a 100. As faixas da correlação são mostradas abaixo: 
import java.util.Scanner;
public class Exerc6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    System.out.print("Nota Conceito: ");
    int nota = input.nextInt();
    input.close();
    if (nota > 0 && nota<= 49 ){
        System.out.println("Nota: " + nota + "\nConceito: Insuficiente");
    }else if (nota >= 50 && nota <=64) {
        System.out.println("Nota: " + nota + "\nConceito: Regular");
    }else if (nota >= 65 && nota <= 84) {
        System.out.println("Nota: " + nota + "\nConceito: Bom");
    }else if (nota >= 85 && nota <= 100) {
        System.out.println("Nota: " + nota + "\nConceito: Ótimo");
    } else {
        System.out.println("Valor inválido");
    }
    
    }
} 