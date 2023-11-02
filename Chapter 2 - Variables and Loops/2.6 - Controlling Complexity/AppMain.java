public class AppMain {
    // Desired output (two different examples, depending on what the constant is set to)...
    // SIZE = 3
    //   #============#
    //   |    <><>    |
    //   |  <>....<>  |
    //   |<>........<>|
    //   |<>........<>|
    //   |  <>....<>  |
    //   |    <><>    |
    //   #============#
    // SIZE = 4
    //   #================#
    //   |      <><>      |
    //   |    <>....<>    |
    //   |  <>........<>  |
    //   |<>............<>|
    //   |<>............<>|
    //   |  <>........<>  |
    //   |    <>....<>    |
    //   |      <><>      |
    //   #================#
    
    private static int SIZE = 9;

    public static void main(String[] args) {
        drawTopBottom();
        drawMiddle();
        drawTopBottom();
    }

    public static void drawTopBottom() {
        System.out.print("#");
        for (int i = 0; i < SIZE * 4; i++) {
            System.out.print("=");
        }
        System.out.println("#");
    }
    public static void drawMiddle() {
        for (int i = 0; i < SIZE; i++) {
            int dots = i * 4;
            System.out.print("|");
            for (int k = 0; k < ((SIZE * 4) - dots - 4) / 2; k++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int k = 0; k < dots; k++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int k = 0; k < ((SIZE * 4) - dots - 4) / 2; k++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = SIZE; i < SIZE * 2; i++) {
            System.out.print("|");
            int dots = (SIZE) * 4 - (i - SIZE + 1) * 4;
            for (int k = 0; k < ((SIZE * 4) - dots - 4) / 2; k++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int k = 0; k < dots; k++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int k = 0; k < ((SIZE * 4) - dots - 4) / 2; k++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
