import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
    
    private static int[] readElements(int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[elements];
        for (int i = 0; i < elements ; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }    

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}

