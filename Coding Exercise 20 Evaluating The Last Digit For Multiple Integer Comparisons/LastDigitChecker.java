public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int lastDigitOfA = a % 10;
            int lastDigitOfB = b % 10;
            int lastDigitOfC = c % 10;
            
            if (lastDigitOfA == lastDigitOfB
                    || lastDigitOfB == lastDigitOfC
                        || lastDigitOfA == lastDigitOfC) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isValid(int a) {
        return a >= 10 ?
            (a > 1000 ? false : true)
                : false;
    }
}

