import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        
        int arrayLength = array.length;
        int index = 0;
        int tmp = 0;
        
        while (index < arrayLength / 2) {
            tmp = array[index];
            array[index] = array[arrayLength - index - 1];
            array[arrayLength - index++ - 1] = tmp;
        }
        
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}

