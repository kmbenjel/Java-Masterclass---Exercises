public class PerfectNumber {
    public static void main(String[] args) {
        int i = 1;
        while (i < 1000000) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a perfect number");
            }
            i++;
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int i = 1, sum = 0;

        while (i < number) {
            if (number % i == 0)
                sum += i;
            i++;
        }

        return sum == number;
    }
}
