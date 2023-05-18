// Faça um programa que exiba todos os números pares a partir de 0 até que encontre um múltiplo de 7 (utilize do/while) 
public class Exerc12 {
    public static void main(String[] args) {
       int i = 0;
       do { i = i + 2;
        if (i % 2 == 0){
        System.out.println(i);}
    
       } while (i % 7 != 0);
    }
}
        