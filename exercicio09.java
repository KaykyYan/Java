// Criar um algoritmo que leia uma velocidade fornecida em m/s (metros por segundo) e apresente na tela a velocidade em km/h.
// Para efetuar a conversão, multiplique o valor em m/s por 3.6.
import java.util.Scanner;
public class exercicio09 {
    public static void main(String []args){
      Scanner leia = new Scanner (System.in);

      int quilometros;
      int metros;
      
      System.out.println("Por favor, informe a quilometragem percorrida? ");
      quilometros = leia.nextInt();

      metros = quilometros * 1000;

      System.out.println("Quantidade de Metros é :  " + metros);

      leia.close();
    }
    
}
