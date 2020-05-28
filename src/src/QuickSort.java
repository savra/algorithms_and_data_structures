import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] sourceArray, int low, int high) {
        if (sourceArray == null) return;
        if (sourceArray.length <= 1) return;
        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        int supportElementIndex = low + (high - low) / 2;
        int supportElement = sourceArray[supportElementIndex]; // Находим опорный элемент

        int i = low;
        int j = high;
        int temp;

        do {
            while (sourceArray[i] < supportElement)
                i++;
            while (sourceArray[j] > supportElement)
                j--;

            if (i <= j) {
                temp = sourceArray[i];
                sourceArray[i] = sourceArray[j];
                sourceArray[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (low < j) quickSort(sourceArray, low, j);
        if (high > i) quickSort(sourceArray, i, high);
    }

    public static void main(String[] args) {
        int[] sourceArray = {1, 4, 3, 2, 9, 7, 6, 5, 8, 10};

        System.out.println("Before sort: " + Arrays.toString(sourceArray));
        quickSort(sourceArray, 0, sourceArray.length - 1);
        System.out.println("After sort: " + Arrays.toString(sourceArray));
    }
}
