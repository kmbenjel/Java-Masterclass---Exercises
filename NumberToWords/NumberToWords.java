import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        while (true) {
            int number = Integer.parseInt(input.nextLine());
            System.out.println(getDigitCount(number));
            System.out.println(reverse(number));
            numberToWords(number);
        }
    }


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        while (reversedNumber > 0) {
            System.out.println(
                    switch (reversedNumber % 10) {
                        case 1->"One";
                        case 2->"Two";
                        case 3->"Three";
                        case 4->"Four";
                        case 5->"Five";
                        case 6->"Six";
                        case 7->"Seven";
                        case 8->"Eight";
                        case 9->"Nine";
                        default -> "Zero";
                    }
            );
            reversedNumber /= 10;
        }
        for (int i = getDigitCount(reverse(number)); i < getDigitCount(number); i++) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int digitCount = 0;
        while (true) {
            digitCount += 1;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        return digitCount;
    }

    public static int reverse (int number) {
        int sign = 1;
        int reversedNumber = 0;
        if (number < 0) {
            sign = -1;
            number = -number;
        }
        while (true) {
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        return sign * reversedNumber;
    }
}
