import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter an integer:");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int size = unsortedArray.length;
        int[] sortedArray = Arrays.copyOf(unsortedArray, size);
        int tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < size - 1; i++) {
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

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) System.out.println("Element " + i + " contents " + array[i]);
    }
}
    
 
