public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        System.out.println(minutes >= 0 ?
            minutes + " min = " + minutes / (60 * 24 * 365)  + " y and "
                + (minutes % (60 * 24 * 365)) / (60 * 24) + " d"
                    : "Invalid Value");
    }
}

