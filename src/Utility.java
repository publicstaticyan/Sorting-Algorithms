import java.util.Random;

public class Utility {

    public static int[] preencheVetor(int tamanho) {
        int[] vet = new int[tamanho]; Random rand = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(tamanho) + 1;
        }
        return vet;
    }
}
