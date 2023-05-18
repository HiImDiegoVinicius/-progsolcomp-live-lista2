// Escreva um programa que, dada a carga máxima de um elevador e a quantidade máxima de pessoas digitadas pelo usuário, leia o peso de cada pessoa, também digitada pelo usuário, 
//que entra no elevador até que a carga máxima seja atingida ou o número máximo de pessoas seja atingido (utilize do /while).
import java.util.Scanner;
public class Exerc20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = input.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaximaPessoas = input.nextInt();

        int pesoTotal = 0;
        int pessoas = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = input.nextInt();
            input.close();
            

            if (pesoTotal + peso <= cargaMaxima && pessoas < quantidadeMaximaPessoas) {
                pesoTotal += peso;
                pessoas++;
                System.out.println("Pessoa adicionada ao elevador.");
            } else {
                System.out.println("Limite de carga ou quantidade de pessoas atingido. Não é possível adicionar mais pessoas.");
                break;
            }

        } while (true);

        System.out.println("Peso total no elevador: " + pesoTotal + " kg");
        System.out.println("Quantidade de pessoas no elevador: " + pessoas);
    }
}

