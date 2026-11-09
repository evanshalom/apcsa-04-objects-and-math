public class MathToolkit {
    public static void main(String[] args) {
        // 1. Use Math.sqrt and Math.pow to print the hypotenuse of legs 6 and 8.
        double hypotenuse = Math.sqrt(Math.pow(6, 2) + Math.pow(8, 2));
        System.out.println("Hypotenuse of 6 and 8: " + hypotenuse);

        // 2. Print the distance between (1, 2) and (4, 6) with the distance formula. Expect 5.0.
        double distance = Math.sqrt(Math.pow(4 - 1, 2) + Math.pow(6 - 2, 2));
        System.out.println("Distance from (1, 2) to (4, 6): " + distance);

        // 3. Print the absolute difference of 12 and 30, then of 7.5 and 9.25, using Math.abs.
        double diff1 = Math.abs(12 - 30);
        double diff2 = Math.abs(7.5 - 9.25);
        System.out.println("Absolute difference of 12 and 30: " + diff1);
        System.out.println("Absolute difference of 7.5 and 9.25: " + diff2);

        // 4. Enrichment (char is not tested): print a random capital.
        char randomCapital = (char) ('A' + (int) (Math.random() * 26));
        System.out.println("Random capital: " + randomCapital);

        // 5. Print a random year from 1990 to 2010 inclusive.
        // n = 2010 - 1990 + 1 = 21, min = 1990
        int min = 1990;
        int n = 2010 - 1990 + 1;
        int randomYear = (int) (Math.random() * n) + min;
        System.out.println("Random year: " + randomYear);
    }
}
