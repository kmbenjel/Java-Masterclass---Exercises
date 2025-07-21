import java.util.Arrays;
import java.util.Random;

public class SortArrayChallenge {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(7);
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArray = sortIntegersDesc(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static int[] sortIntegersDesc(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int tmp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tmp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
