// Criar um algoritmo que leia dois números inteiros e apresente na tela
// o resto da divisão do primeiro pelo segundo número.

import java.util.Scanner;

public class exercicio04 {
    public static void main(String []args){
     Scanner leia = new Scanner (System.in);
     System.out.print("Por favor, digite um numero? ");
     int num1 = leia.nextInt();

     System.out.print("Por favor, digite um numero? ");
     int num2 = leia.nextInt();

     int restodivisão = num1 % num2;

     System.out.println(restodivisão);

     leia.close();

    }

}
