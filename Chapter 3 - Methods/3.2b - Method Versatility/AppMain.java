public class AppMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(randomNumber(100) + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(randomNumber(100, 500) + " ");
        }
    }
    
    // Put your functions here...
    // Function 1 should: should return a value less than a maximum provided value: [0,𝑚𝑎𝑥𝑉𝑎𝑙𝑢𝑒).
    // Function 2 should: should return a value between two provided doubles: [𝑚𝑖𝑛𝑉𝑎𝑙𝑢𝑒,𝑚𝑎𝑥𝑉𝑎𝑙𝑢𝑒).

    private static int randomNumber(int ceiling) {
        return randomNumber(0, ceiling);
    }

    private static int randomNumber(int floor, int ceiling) {
        return (int) (Math.random() * (ceiling - floor) + floor);
    }

}
