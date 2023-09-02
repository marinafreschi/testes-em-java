
public class ExemploThread {
    public static void main(String[] args){
        int []vet = new int[100];
        
        for(int i=0; i<vet.length; i++){
            vet[i]=i;
        }

        ClassedaThread parte1 = new ClassedaThread (0, 50, vet);
        ClassedaThread parte2 = new ClassedaThread (50, 100, vet);

        parte1.start();
        parte2.start();

        int resultadofinal = parte1.resultado + parte2.resultado;

        System.out.println("Soma = " + resultadofinal);

    }
    
}
