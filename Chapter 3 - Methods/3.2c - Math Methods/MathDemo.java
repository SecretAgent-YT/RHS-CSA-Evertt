// Demos the creation of simple math methods (pow, sumToN, ...)
public class MathDemo {
    public static void main(String[] args) {

        // Add code the exercises (run & test) all the code you wrote in this class. 
        // Pick good examples (non-trivial but also something you can hand-verify).  
        // Be sure to identify the output For example: System.out.println("pow(2, 3) == " + pow(2, 3));
        // TODO: FINISH CALLING ALL METHODS. 
        System.out.println("Power 2^3");
        System.out.println(power(2, 3));
        System.out.println("Factorial !5");
        System.out.println(factorial(5));
        System.out.println("Sum of 1 + 2 + 3");
        System.out.println(sumTo(3));
        System.out.println("Sum of 1*1 + 2*2 + 3*3");
        System.out.println(sumSquares(3));
        System.out.println("Repeat string hi 4 times");
        System.out.println(repeatString("hi", 4));
        System.out.println("Print \" 40 \"");
        System.out.println(padString("40", 4));
        System.out.println("Table of Squares to 10");
        System.out.println(tableOfSquares(10));
        System.out.println("---- MathDemo: Done ----"); 
    }
    
    // ------------------------------------------------------
    // computes 'num' to the 'exponent'  Thus pow(2,3) == 8
    // ‘exponent’ is required to be non-negative integer.  
    // num and exponent are both integers. returns an integer.  
    // TODO: implement a power method
    
    public static int power(int num, int exponent) {
        int count = 1;
        for (int i = 0; i < exponent; i++) {
            count *= num;
        }
        return count;
    }

    // ------------------------------------------------------
    // computes n! that is n * (n-1) * (n-2) ... 3 * 2 * 1
    // factorial(0) == 1.  
    // takes an integer n and returns an integer; 
    // TODO implement a factorial method 

    public static int factorial(int num) {
        if (num <= 0) return 1;
        int count = 1;
        for (int i = num; i > 0; i--) {
            count *= i;
        }
        return count;
    }

    // ------------------------------------------------------
    // computes the sum of all integers from 1 to maxNum inclusive.  
    // Thus sumToN(0) == 0  sumToN(3) == 6
    // takes an integer maxNum and returns an integer; 
    // TODO implement a sumToN method
    
    public static int sumTo(int num) {
        if (num == 0) return 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        return count;
    }

    // ------------------------------------------------------
    // computes the sum of the squares to n.   
    // that is N*N + (N-1)*(N-1) ... 3*3 + 2*2 + 1*1
    // takes an integer maxNum and returns an integer     
    // TODO implement a sumSquares method
    
    public static int sumSquares(int number) {
        int count = 0;
        for (int i = number; i > 0; i--) {
            count += i * i;
        }
        return count;
    }

    // ------------------------------------------------------
    // returns a string that is 'str' repeated 'count' times 
    // takes a str and count argument and returns a string. 
    // TODO implement a repeat method  
    
    public static String repeatString(String str, int count) {
        String string = "";
        for (int i = 0; i < count; i++) {
            string += str;
        }
        return string;
    }

    // ------------------------------------------------------
    // returns a string that is 'str' padded with spaces 
    // so that it has a total of 'width' characters
    // Callers should insure that the length of str <= width
    // Takes a str and width argument and returns a string.
    // TODO implement a padLeft method  
    
    public static String padString(String str, int width) {
        if (str.length() >= width) return null;
        String string = "";
        for (int i = 0; i < (width - str.length()) / 2; i++) {
            string += " ";
        }
        string += str;
        int secondPad = (width - str.length()) / 2;
        if ((width - str.length()) % 2 != 0) {
            secondPad++;
        }
        for (int i = 0; i < secondPad; i++) {
            string += " ";
        }
        return string;
    }

    // ------------------------------------------------------
    // print a table of square that starts at 1 and goes up to and includes maxN
    // +-----+-------+
    // |  N  |  N*N  |
    // +-----+-------+
    // |   1 |     1 |
    // |   2 |     4 |
    //      ... omitted ...
    // |  10 |   100 |
    //      ... omitted ...
    // | 100 | 10000 | 
    // +-----+-------+
    // You can assert that maxN*maxN < 100000 and maxN < 1000
    // Thus N will be at most a 3 digit number and maxN will be
    // at most a 5 digit number.   
    public static String tableOfSquares(int maxN) {
        String string = "+-----+-------+\n|  N  |  N*N  |\n+-----+-------+\n";
        assert(maxN < 10000);
        for (int i = 1; i <= maxN; i++) {
            String str = "|";
            str += padString(Integer.toString(i), 5);
            str += "|";
            str += padString(Integer.toString(power(i, 2)), 7);
            str += "|\n";
            string += str;
        }
        string += "+-----+-------+";
        return string;
    }    
}  
