//  Crie um programa que lê um número entre 1 e 12, correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro. Ao final, 
//o programa deve imprimir uma mensagem identificando, com base no número digitado, o nome do mês e a estação. 
import java.util.Scanner;
public class Exerc8 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite numero do mês (1-12): ");
        int numeroMes = input.nextInt();
        input.close();
        String nomeMes = "";
        String estacao = "";

    switch (numeroMes) {
        case 1:
         nomeMes = "Janeiro";
         estacao = "Verão";
         break;
        case 2:
         nomeMes = "Fevereiro";
         estacao = "Verão";
         break;
        case 3:
         nomeMes = "Março";
         estacao = "Outono";
         break;
        case 4:
         nomeMes = "Abril";
         estacao = "Outono";
         break;
        case 5:
         nomeMes = "Maio";
         estacao = "Outono";
         break;
        case 6:
         nomeMes = "Junho";
         estacao = "Inverno";
         break;
        case 7:
         nomeMes = "Julho";
         estacao = "Inverno";
         break;
        case 8:
         nomeMes = "Agosto";
         estacao = "inverno";
         break;
        case 9:
         nomeMes = "Setembro";
         estacao = "Primavera";
         break;
        case 10:
         nomeMes = "Outubro";
         estacao = "Primavera";
         break;
        case 11:
         nomeMes = "Novembro";
         estacao = "Primavera";
         break;
        case 12:
         nomeMes = "Dezembro";
         estacao = "Verão";
         break;
        default:
         System.out.println("Mês inválido");
        System.exit(0);
    }
        System.out.printf("Mês:%s\nEstação:%s", nomeMes, estacao);




    

    }
}