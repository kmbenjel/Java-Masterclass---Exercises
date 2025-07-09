public class IntEqualityPrinter {
    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println( x == y ?
            (x == z ? "All numbers are equal" : "Neither all are equal or different")
                : (x != z && y != z ? "All numbers are different" : "Neither all are equal or different")
        );
    }
}

