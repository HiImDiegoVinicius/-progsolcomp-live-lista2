// Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50  
public class Exerc15 {
    public static void main(String[] args) {
    int[][] matriz = new int[10][10];
        
        // Preencher a matriz com zeros
        for (int i = 0; i < matriz.length; i = i + 1) {
            for (int j = 0; j < matriz[i].length; j = j + 1) {
                matriz[i][j] = 0;
            }
        }
        
        // Imprimir a matriz
        for (int i = 0; i < matriz.length; i = i + 1) {
            for (int j = 0; j < matriz[i].length; j = j + 1) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

