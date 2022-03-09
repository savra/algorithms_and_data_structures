import java.util.Arrays;

public class BinarySearch {
    private static Integer binarySearch(int[] sourceArray, int searchValue) {
        int low = 0;
        int high = sourceArray.length - 1;
        int midElement, guess;

        while (low <= high) {
            midElement = (high + low) / 2;
            guess = sourceArray[midElement];

            if (searchValue < guess) {
                high = midElement - 1;
            } else if (searchValue > guess) {
                low = midElement + 1;
            } else {
                return midElement;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] sourceArray = {1, 4, 3, 2, 9, 7, 6, 5, 8, 10};
        Arrays.sort(sourceArray);

        System.out.println("Before sort: " + Arrays.toString(sourceArray));
        Integer binarySearch = binarySearch(sourceArray, 11);
        System.out.println("Result: " + binarySearch);
    }
}
