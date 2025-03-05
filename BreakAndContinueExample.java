public class BreakAndContinueExample {
    public static void main(String[] args) {
        // Example combining break and continue in a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping number " + i);
                continue;  // Skips the current iteration when i is 5
            }

            if (i == 8) {
                System.out.println("Breaking the loop when i is " + i);
                break;  // Exits the loop when i is 8
            }

            System.out.println(i);  // Prints the current value of i
        }
        System.out.println("Loop terminated.");
    }
}

