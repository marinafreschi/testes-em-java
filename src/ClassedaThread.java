public class ClassedaThread extends Thread {
    
    int posicaoinicial;
    int posicaofinal;
    int []vet;
    int resultado = 2475;

    public ClassedaThread(int posicaoinicial, int posicaofinal, int[] vet){
        this.posicaoinicial = posicaoinicial;
        this.posicaofinal = posicaofinal;
        this.vet = vet;
    }

    @Override
    public void run(){
        for (int i= posicaoinicial; i<posicaofinal; i++){
            resultado = resultado + vet[i];
        }
    }
}
