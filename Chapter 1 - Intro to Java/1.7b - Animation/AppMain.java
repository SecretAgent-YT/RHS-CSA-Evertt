import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AppMain {

    private static int delay = 100;

    public static void main(String[] args) throws Exception {

        System.out.print("\033[33m"); // Yellow
        for (int a = 0; a < 50; a++) {
            String str = "";
            for (int i = 0; i < 8; i++) {
                if (i == 0) {
                    str += "               ";
                } else {
                    str += "               |";
                }
                for (int k = 0; k < i; k++) {
                    if (k != 0) str += " ";
                }
                str += "4";
                for (int h = 0; h < 48 - i; h++) {
                    str += " ";
                }
                str += "|\n";
            }
            String string;
            if (a < 9) {
                string = "                  -------------->";
                for (int i = 0; i < a; i++) {
                    string = string.replaceFirst(" ", "");
                }
                delay = 100;
            } else {
                string = "         ";
                for (int i = 0; i < a - 9; i++) {
                    string += " ";
                }
                string += "-------------->";
                delay = 10;
            }
            int index = string.indexOf(">");
            int count = 49 - index;
            for (int i = 0; i < count; i++) {
                string += " ";
            }
            string += "|\n";
            str += string;
            for (int i = 8; i > 0; i--) {
                str += "              ";
                for (int k = 0; k < i; k++) {
                    if (i != 1 && k == 1) {
                        str += "|";
                    } else {
                        str += " ";
                    }
                }
                str += "4";
                for (int h = 0; h < 49 - i; h++) {
                    str += " ";
                }
                str += "|\n";
            }
            System.out.println(str);
            if (a <= 48) {
                endFrame();
            } 
        }
    }


    public static void endFrame() {
        endFrame(delay);
    }


    public static void endFrame(int delayMilliSeconds) {
        // Delay a for a short time (leave it on the screen)
        try {
            Thread.sleep(delayMilliSeconds);
        } catch (Exception ex) {
        }


        // Clear the console
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}