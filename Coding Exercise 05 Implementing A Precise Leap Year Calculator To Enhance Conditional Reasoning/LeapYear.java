public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 10000) {
            if (year % 4 == 0) {
                return year % 100 == 0 ? year % 400 == 0 : true;
            }
        }
        return false;
    }
}

