// Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final conforme condições a seguir: Venda a Vista - 
//desconto de 10% Venda a Prazo 30 dias - desconto de 5% Venda a Prazo 60 dias - mesmo preço Venda a Prazo 90 dias - a
//créscimo de 5% Venda com cartão de débito - desconto de 8% Venda com cartão de crédito - desconto de 7% 
import java.util.Scanner;
public class Exerc9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor da venda: ");
        double valorDaVenda = input.nextDouble();

        System.out.println("Selecione a condição de pagamento:");
        System.out.println("1 - Venda a vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");

        System.out.println("Opção: ");
        int opcao = input.nextInt();
      input.close();
   

        double total = 0.0;
        double desconto10 = valorDaVenda * 0.1;
        double desconto5 = valorDaVenda * 0.05;
        double desconto8 = valorDaVenda * 0.08;
        double desconto7 = valorDaVenda * 0.07;

        switch(opcao) {
            case 1:
             total = valorDaVenda - desconto10; // desconto de 10% a vista
             break;
            case 2:
             total = valorDaVenda - desconto5; // desconto de 5% prazo 30 dias
             break;
            case 3:
             total = valorDaVenda; // mesmo preço 60 dias
             break;
            case 4:
             total = valorDaVenda + desconto5; //acrescimo de 5% 90 dias
             break;
            case 5:
             total = valorDaVenda - desconto8; //desconto débito de 8%
             break;
            case 6:
             total= valorDaVenda - desconto7; // desconto crédito de 7%
             break;
            default:
             System.out.println("Opção de pagamento inválida");
            

    }
    System.out.printf("O valor total é de R$%2.2f",total);
    }
}
