//  Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço: R$ 5.50 por diária, se o número de diárias for maior que 15;
// R$ 6.00 por diária, se o número de diárias for igual a 15; R$ 8.00 por diária, se o número de diárias for menor que 15. 
    import java.util.Scanner;
public class Exerc7 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de diarias ");
        int numDiarias = input.nextInt();
        input.close();
        double valorDiaria = 60.00;
        double taxaServico;
        if (numDiarias > 15) {
            taxaServico = 5.50;
        }else if(numDiarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }
        double totalHospedagem = (valorDiaria + taxaServico) * numDiarias;
        System.out.println("Valor R$: " + totalHospedagem);

}
}