import java.util.Scanner;

public class entre01 {
    public static void main(String[] args) {
    

        int b = 1;
        int c = 0;
        int auxiliar;

        for(int i = 0; i < 30; i++){
            System.out.println(b);
            auxiliar = b;
            b = b + c;
            b = auxiliar;
        }
    }
}
