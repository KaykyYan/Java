// Criar um algoritmo que leia a idade de uma pessoa expressa em anos
// e apresente na tela esta idade expressa em meses e dias.
import java.util.Scanner;

public class exercicio05 {
    public static void main(String []args){
     Scanner leia = new Scanner(System.in);
     int anos, dias, meses;
     int idadeEmDias;

     System.out.println("Por favor, digite os anos? ");
     anos = leia.nextInt();
     System.out.println("Por favor, digite os meses");
     meses = leia.nextInt();
     System.out.println("Por favor, digite os dias? ");
     dias = leia.nextInt();

     idadeEmDias = anos * 360 + meses * 30 + dias;
     System.out.println("Idade em dias :" + idadeEmDias);


    leia.close();
    }
    
}
