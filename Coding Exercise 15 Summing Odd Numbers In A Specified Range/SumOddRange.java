public class SumOddRange {
    public static boolean isOdd(int number) {
        return number > 0 && number % 2 == 1;
    }
    
    public static int sumOdd(int start, int end) {
        if (start > 0 && end > 0 && start <= end) {
            int sum = 0;
            for (int i = 0; start + i <= end; i++) {
                sum += isOdd(start + i) ? start + i : 0;
            }
            return sum;
        }
        return -1;
    }
}

