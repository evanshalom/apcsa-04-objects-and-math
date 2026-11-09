public class DiceSimulator {
    public static void main(String[] args) {
        // Roll one die: an int from 1 to 6.
        int die1 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1: " + die1);
    }
}
