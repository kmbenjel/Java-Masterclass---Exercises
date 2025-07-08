public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        return
            kilometersPerHour > 0 ? Math.round(kilometersPerHour / 1.609)
                : (kilometersPerHour == 0 ? 0 : -1);
    }
    
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(
                kilometersPerHour >= 0 ? kilometersPerHour + " km/h = " + milesPerHour + " mi/h"
                    : "Invalid Value"
            );
    }
}

