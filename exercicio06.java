// Criar um algoritmo que leia a idade de uma pessoa expressa em anos, mês e dias e apresente na tela a idade dessa pessoa expressa apenas em dias.
// Considerar ano com 365 dias e mês com 30 dias.
import java.util.Scanner;

public class exercicio06 {
    public static void main(String []args){
    Scanner leia = new Scanner (System.in);
    int anos, meses, idade;
    int dias;

    System.out.println("Por favor, digite os anos? ");
    anos = leia.nextInt();
    System.out.println("Por favor, digite os meses? ");
    meses = leia.nextInt();
    System.out.println("Por favor, digite a idade? ");
    idade = leia.nextInt();

    dias = anos * 360 + meses * 30 + idade;
    System.out.println("Dias : " + dias);

    leia.close();
    }
}
