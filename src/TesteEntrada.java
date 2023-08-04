import java.util.Scanner;

public class TesteEntrada {
    public static void main(String[]args){
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("1-Somar\n2-Subtrair\n3-Sair");
            entrada.nextInt();
        }
    }
}
