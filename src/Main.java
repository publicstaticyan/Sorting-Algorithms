import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final int[] TAMANHOS = new int[] {62500, 125000, 250000, 375000};

    public static void main(String[] args) {

        for (int i = 0; i < TAMANHOS.length; i++) {

            for (int j = 1; j <= 50; j++) {

                int[] vet = Utility.preencheVetor(TAMANHOS[i]);

                new InsertionSort(vet);

                new MergeSort(vet);
            }
        }

        new QuickSort();
    }
}
