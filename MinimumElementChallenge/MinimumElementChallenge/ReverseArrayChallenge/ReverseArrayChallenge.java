import java.util.Arrays;
import java.util.Scanner;
public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] toBeReversed = readIntegers();
        System.out.println("Numbers to be reversed: " + Arrays.toString(toBeReversed));
        reverse(toBeReversed);
        System.out.println("Reversed numbers: " +Arrays.toString(toBeReversed));
    }

    // Just for testing purposes
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

    private static void reverse(int... numbers) {
        int maxIndex =  numbers.length - 1;
        int halfLength = numbers.length / 2;
        int tmp;
        for (int i = 0; i < halfLength; i++) {
            tmp = numbers[i];
            numbers[i] = numbers[maxIndex - i];
            numbers[maxIndex - i] = tmp;
        }
    }
}
