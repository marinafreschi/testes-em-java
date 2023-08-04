import java.util.Scanner;

public class calculadora {
    public static void main(String[]args){
        double n1,n2;
        int op;
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.println("1-Soma\n2-Subtração\n3-Mutiplicação\n4-Divisão\n5-Sair");
        op = input.nextInt();
        if (op==5)
            break;
        if (op<1 || op>5){
            System.out.println("Opção do menu inválida");
            continue;
        }
        System.out.println("Digite 2 numeros:");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        switch (op){
            case 1: System.out.println("Soma = "+ (n1+n2));
                    break;
            case 2: System.out.println("Subtração = "+ (n1-n2));
                    break;
            case 3: System.out.println("Multiplicação = "+ (n1*n2));
                    break;
            case 4: 
                if (n2==0)
                    System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                else System.out.println("Divisão = "+ (n1/n2));
        }
        }

    }
}
