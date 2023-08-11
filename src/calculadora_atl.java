import java.util.Scanner;

public class calculadora_atl {
    public static double soma (double n1, double n2){
        return (n1 + n2);
    }

    public static double subtrai (double n1, double n2){
        return (n1 - n2);
    }

    public static double mutiplica (double n1, double n2){
        return (n1 * n2);
    }

    public static double divide (double n1, double n2){
        return (n1 / n2);
    }

    public static int menu(){
        Scanner input = new Scanner (System.in);
        System.out.println("1-Soma\n" + //
                "2-Subtração\n" + //
                "3-Mutiplicação\n" + //
                "4-Divisão\n" + //
                "5-Sair");
        return (input.nextInt());
    }

    public static void main(String[] args){
        double n1, n2;
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 2 números");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        do {
            op = menu();
            switch(op){
                case 1: System.out.println("Soma = "+ soma(n1,n2));
                        break;
                case 2: System.out.println("Subtração = "+ subtrai(n1,n2));
                        break;
                case 3: System.out.println("Mutiplicação = "+ mutiplica(n1,n2));
                        break;
                case 4: 
                    if (n2!=0)
                        System.out.println("Divisão = " + divide(n1,n2));
                    else
                        System.out.println("Não há divisão por zero");
                    break;    
            }

        } while (op != 5);
    }
}
