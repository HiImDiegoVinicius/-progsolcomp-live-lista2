// Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50  

public class Exerc14 {
    public static void main (String[] args){
    int[] vetor = new int[50];
    for (int i = 0; i < vetor.length; i = i + 1) {
        vetor[i] = 0;
    }
    for (int i = 0; i < vetor.length; i = i + 1) {
        System.out.print(vetor[i] + " ");


    }
}   
}
