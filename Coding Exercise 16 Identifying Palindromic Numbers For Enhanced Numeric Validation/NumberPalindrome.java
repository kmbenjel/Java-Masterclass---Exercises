public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int n;
        int lastDigit;
        
        if (number < 0) {
            number = number * -1;
        }
        n = number;
        while (n > 0) {
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }

        return number == reverse;
    }
}

