// Criar um algoritmo que leia o tempo de duração de um evento em uma fábrica expressa em segundos
// e apresente-o na tela expresso em horas, minutos e segundos.
import java.util.Scanner;

public class exercicio08 {
    public static void main(String []args) {
    Scanner leia = new Scanner(System.in);

    int N = leia.nextInt();
    int horas;
    int minutos;
    int segundos;

    horas = N/3600;
    minutos = (N % 3600) / 60;
    segundos = (N % 3600) % 60;

    System.out.println(horas + ":" + minutos + ":" + segundos);

    leia.close();

    }
}
