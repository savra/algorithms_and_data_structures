import java.util.Arrays;
import java.util.Random;

/*Сортировка выбором*/
public class SelectionSort {
    public static int[] selectionSort(int[] sourceArray) {
        int minIndex;
        int temp;

        for (int i = 0; i < sourceArray.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < sourceArray.length - 1; j++) {
                if (sourceArray[j] < sourceArray[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                temp = sourceArray[i];
                sourceArray[i] = sourceArray[minIndex];
                sourceArray[minIndex] = temp;
            }
        }

        return sourceArray;
    }

    public static void main(String[] args) {
        int[] testArray = new int[100000];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = new Random().nextInt(100_000);
        }

        System.out.println(Arrays.toString(selectionSort(testArray)));
    }
}
