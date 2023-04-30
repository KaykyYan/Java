// Criar um algoritmo que receba o valor do salário de um funcionário
// e o valor do salário mínimo
// e apresente na tela quantos salários mínimos ganha esse funcionário.

import java.util.Scanner;
public class exercicio11 {

    public static void main(String []args) {
        Scanner leia = new Scanner (System.in);

      double salario;
      double salariominimo;
      double quantidade;

      System.out.println("Por favor, informe o valor do salario para o funcionario? ");
      salario = leia.nextDouble();

      System.out.println("Por favor, informe o salario minimo ? ");
      salariominimo = leia.nextDouble();

      quantidade = salario / salariominimo;

      System.out.printf("O funcionario ganhar %.2f salarios minimos .%n", quantidade);

      leia.close(); 

    }
}
