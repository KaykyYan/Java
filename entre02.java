import java.util.Scanner;

public class entre02 {
    public static void main(String []args) {
        try (Scanner leia = new Scanner(System.in)) {
            int num, prim = 0, seg = 1, seguinte;
            boolean pertence = false;

            System.out.print("Por favor, Digite um número inteiro positivo: ");
            num = leia.nextInt();
            
            if (num == prim || num == seg) {
                pertence = true;
            } else {
                while (seg <= num) {
                    seguinte = prim + seg;
                    if (seguinte == num) {
                        pertence = true;
                        break;
                    }
                    prim = seg;
                    seg = seguinte;
                }
            }
            if (pertence) {
                System.out.println(num + " pertence à sequencia de Fibonacci : ");

            } else {
                System.out.println(num + " nao pertence a sequencia de Fibonacci : ");
            }
        }
    }
    
}
