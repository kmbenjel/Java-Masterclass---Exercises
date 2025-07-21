import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] userIntegers = readIntegers();
        System.out.println("Inputted numbers: " + Arrays.toString(userIntegers));
        System.out.println("Min: " + findMin(userIntegers));
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input some comma separated numbers:");
        String[] input = scanner.nextLine().split(",");
        int[] ints = new int[input.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(input[i].trim());
        }
        return ints;
    }

    public static int findMin(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
