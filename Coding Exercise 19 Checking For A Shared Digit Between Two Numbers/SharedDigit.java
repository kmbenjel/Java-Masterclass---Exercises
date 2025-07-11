public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 >= 10 && number1 <= 99
                && number2 >= 10 && number2 <= 99) {
            if (number1 / 10 == number2 / 10
                    || number1 / 10 == number2 % 10
                        || number1 % 10 == number2 / 10
                            || number1 % 10 == number2 % 10)
                            return true;
        }
        return false;
    }
}

