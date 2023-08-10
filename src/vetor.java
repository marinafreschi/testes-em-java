public class vetor {
    public static void main(String[] args){
        int [] vet = {45,32,21,10};
        for (int x:vet){
            System.out.println(x);
        }

        System.out.println("Mostrando novamente os elementos:");
        for (int i=0; i<vet.length; i++){
            System.out.println(vet[i]);
        }
    }
}
