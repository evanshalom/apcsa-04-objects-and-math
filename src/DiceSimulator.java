public class DiceSimulator {
    public static void main(String[] args) {
        // Roll one die: an int from 1 to 6.
        int die1 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1: " + die1);

        int die2 = (int)(Math.round() * 6) + 1;
        System.out.println("Die 2: " + die2);

        System.out.println("Die 1 + 2: " + (die1 + die2));

        int n = 20;
        int die3 = (int)(Math.round() + n) + 1;
        int die4 = (int)(Math.round() * 6);

        System.out.println("Die 3: " + die3);
        System.out.println("Die 4: " + die4);

        int die5 = (int)(Math.round() * 50) + 25;
         System.out.println("Die 5: " + die5);

    }
}
