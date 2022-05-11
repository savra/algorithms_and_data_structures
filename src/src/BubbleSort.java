import java.util.Arrays;

/*Пузырьковая сортировка*/
public class BubbleSort {
    public static int[] bubbleSort(int[] sourceArray) {
        int temp;

        for (int i = 0; i < sourceArray.length; i++) {
            for (int j = i + 1; j < sourceArray.length - 1; j++) {
                if (sourceArray[j] < sourceArray[i]) {
                    temp = sourceArray[i];
                    sourceArray[i] = sourceArray[j];
                    sourceArray[j] = temp;
                }
            }
        }

        return sourceArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[] {11, 25, 12, 22, 64})));
    }
}


