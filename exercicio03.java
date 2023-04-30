//Criar um algoritmo que leia dois números inteiros e apresenta na tela 
//a soma, subtração, multiplicação e divisão dos respectivos números.
import java.util.Scanner;
public class exercicio03 {

 public static void main(String []args) {
    Scanner leia = new Scanner(System.in);
    System.out.print("Por favor, digite um numero?");
    int num1 = leia.nextInt();

    System.out.print("Por favor, digite um numero?");
    int num2 = leia.nextInt();

    int soma = num1 + num2;

    int subtração = num1 - num2;

    int multiplicação = num1 * num2;

    int divisão = num1 / num2;
    
    System.out.println(soma);
    System.out.println(subtração);
    System.out.println(multiplicação);
    System.out.println(divisão);


    leia.close();
    }

}
