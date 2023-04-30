// Criar um algoritmo que leia um número inteiro
// e apresente na tela o seu antecedente e o seu sucessor.
import java.util.Scanner;
public class exercicio02 {
    public static void main(String args[]){

    int num1, antecessor, sucessor;

    Scanner  leia = new Scanner(System.in);

    num1 = leia.nextInt();
    
    antecessor = num1 - 1;
    sucessor = num1 + 1;

    System.out.println("Antecessor é" + antecessor + "e o sucesor é" + sucessor);
    
    
    leia.close();
    }
}
