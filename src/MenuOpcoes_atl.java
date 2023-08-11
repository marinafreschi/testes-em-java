import java.util.Scanner;

public class MenuOpcoes_atl {
    public static int menu(){
        Scanner input = new Scanner (System.in);
        int op;
        System.out.println("Opções:\n1 Média entre os numeros digitados\n" +
                                    "2 Diferença do maior pelo menor\n" +
                                    "3 Produto entre os numeros digitados\n" +
                                    "4 Divisão do primeiro pelo segundo\n" +
                                    "5 Sair");
        op = input.nextInt();
        return op;
    }

    public static double media(int n1, int n2){
        double m;
        m = (double)(n1 + n2)/2;
        return m;
    }

    public static int diferenca(int n1, int n2){
        if (n1>n2)
            return(n1-n2);
        else
            return(n2-n1);
    }

    public static int produto(int n1, int n2){
        return(n1*n2);
    }

    public static double divisao(int n1, int n2){
        return (double)n1/n2;
    }

    public static void main(String[] args){
        int op;
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 2 numeros:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        do{
            op = menu();
            switch (op){
                case 1: 
                    System.out.println("Média = "+ media(n1,n2));
                    break;
                case 2:
                    System.out.println(("Diferença = "+ diferenca(n1, n2)));
                    break;
                case 3:
                    System.out.println("Produto = "+ produto(n1,n2));
                    break;
                case 4:
                    if (op!=0)
                        System.out.println(("Divisão = "+ divisao(n1, n2)));
                    else
                        System.out.println("Não há divisão por zero");
                    break;
                case 5:
                    System.out.println(("Programa Finalizado"));
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        } while (op!=5);
    }
}
