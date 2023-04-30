import java.util.Scanner;
public class exercicio{
   public static void main(String[]args){
       Scanner leia = new Scanner(System.in);
       System.out.print("Digite um numero: ");
       int num1 = leia.nextInt();

       System.out.print("Digite um numero: ");
       int num2 = leia.nextInt();

       int consecutivo;
       int consecutivo2;


       if (num1 >= 0) {
       consecutivo = num1 + 1;
       consecutivo2 = num2 + 1;

       } else {
           consecutivo = num1 - 1;
           consecutivo2 = num2 - 1;
       }

       System.out.println(consecutivo);
       System.out.println(consecutivo2);

       System.out.print("Digite um numero?");

       leia.close();
   }

}