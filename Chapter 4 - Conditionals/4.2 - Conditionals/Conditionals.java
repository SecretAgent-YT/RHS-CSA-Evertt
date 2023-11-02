public class Conditionals {

    public boolean firstStars(String text) {
        int streak = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i > 2) break;
            if (text.charAt(i) == '*') {
                streak++;
                if (streak == text.length() || streak == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean compareDouble(double number, double expected) {
        return Math.abs(number - expected) < AppMain.EPSILON;
    }

    public boolean logicCheck(int x, int y, boolean b) {
        return (x > 10) || ((x > y) && b);
    }
}
