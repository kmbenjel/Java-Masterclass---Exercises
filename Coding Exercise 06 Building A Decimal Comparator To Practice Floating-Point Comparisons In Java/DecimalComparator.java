public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {
        return (int) (firstDouble * 1000)
            == (int) (secondDouble * 1000);
    }
}


