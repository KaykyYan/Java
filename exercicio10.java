// Criar um algoritmo que leia uma distância e o total de litros de combustível
// gasto por um automóvel para percorrê-la
// calcule e apresente na tela o consumo médio de combustível.
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[]args){
        Scanner leia = new Scanner (System.in);

        double distancia;
        double consumomedio;
        double litros;

        System.out.println("Por favor, me informe a distancia percorrida ? ");
        distancia = leia.nextDouble();

        System.out.println("Por favor, me informe o total de litros gastos ? ");
        consumomedio = leia.nextDouble();

        litros = distancia / consumomedio;

        System.out.println("O consumo medio de combustivel foi: " + litros);


      leia.close();  
    }
    
}
