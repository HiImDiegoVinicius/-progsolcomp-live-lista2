// Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa. Depois, o programa deve dar a seguinte opção
// “Deseja visualizar dados completos?”. Se o caractere digitado pelo usuário for ‘S’ o programa deve imprimir na tela Nome, Sobrenome, idade e naturalidade. Se o caractere digitado 
//pelo usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se o caractere não for nenhuma das outras opções acima o programa deve imprimir “Digitação errada. Tente Novamente”.
import java.util.Scanner;
public class Exerc5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.println("Digite sua idade em anos:");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("Digite sua naturalidade:");
        String naturalidade = input.nextLine();

        System.out.println("Deseja visualizar dados completos? Digite: (S/N) ");
        char inforCompleta = input.nextLine().charAt(0);
        
        if (inforCompleta == 'S' || inforCompleta == 's') {System.out.println("Nome: " + nome); System.out.println("Sobrenome: " + sobrenome); System.out.println("Idade: " + idade); System.out.println("Naturalidade: " + naturalidade);}
       else if (inforCompleta == 'n' || inforCompleta == 'n') {System.out.println("Nome: " + nome); System.out.println("Idade: " + idade); }
       else {System.out.println("Digitação errada. Tente Novamente");}
        
        input.close();
        
        }
        


    
}
