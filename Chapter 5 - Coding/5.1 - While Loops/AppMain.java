public class AppMain {
    
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (count < 20) {
            if (numPrime(i)) {
                System.out.println("Num: " + i + " Count: " + (count + 1));
                count++;
            }
            i++;
        }
    }

    public static boolean numPrime(int num) {
        if (num == 1 || num == 4) return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
