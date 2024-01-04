public class Cumulative {

    public static final String ALPHABETSTR = "abcdefghijklmnopqrstuvwxyz"; 

    public static String alphabet(char first, int count) {
        // Return a String consiting of a section of the alphabet.
        //  It should start with letter 'first' and contain 'count' letters.
        //  If count goes past 'z', then it should wrap back around to 'a' 
        //    for the next letter.
        //  You can assume that first is a lowercase letter.
        
        // Examples...
        //  alphabet('a', 5) -> "abcde"
        //  alphabet('c', 4) -> "cdef"
        //  alphabet('y', 6) -> "yzabcd"
        String result = "";
        for (int i = ALPHABETSTR.indexOf(first); i < ALPHABETSTR.indexOf(first) + count; i++) {
            result += ALPHABETSTR.charAt(i);
            if (i >= 25) {
                int length = count - result.length();
                for (int k = 0; k < length; k++) {
                    result += ALPHABETSTR.charAt(k);
                }
                break;
            }
        }
        return result;
    }

    public static int factorSum(int n) {
        // Returns the sum of all factors of n, except for n itself
        
        // Examples...
        //  factorSum(6) -> 6      // 1 + 2 + 3
        //  factorSum(14) -> 10    // 1 + 2 + 7
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) count += i;
        }
        return count;
    }

    public static boolean isPerfect(int n) {
        // Returns true if n is a perfect number, false otherwise
        //  A perfect number is a positive integer that is equal to the sum of its proper divisors.
        //  Use the factorSum function you wrote to help you do this (and do not copy the code).
        
        // Examples...
        //  factorSum(6) -> true   // 1 + 2 + 3 = 6, so it is a perfect number
        //  factorSum(14) -> false // 1 + 2 + 7 = 10, which is not 14, so not perfect
        int count = 0;
        for (int i = 1; i < n; i++) {
            count += i;
            if (count == n) return true;
            if (count > n) return false;
        }
        return false;
    }
}
