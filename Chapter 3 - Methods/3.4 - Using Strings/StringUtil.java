public class StringUtil {

    public static String firstHalf(String input) {
        input = input.substring(0, input.length() / 2);
        return input;
    }

    public static String beforeSpace(String input) {
        // Returns a string containing the portion of the string BEFORE the space
        // In the case of no space, the full string should be returned
        //  Example: "abcd ef" -> "abcd"
        // 
        // Requirements...
        //  - Use the string function substring.
        input = input.substring(0, input.indexOf(" "));
        return input;
    }

    public static String afterSpace(String input) {
        input = input.substring(input.indexOf(" ") + 1);
        return input;
    }

    public static String swapAtSpace(String input) {
        String before = beforeSpace(input);
        String after = afterSpace(input);
        return after + " " + before;
    }

    public static char firstNonRepeatedChar(String input) {
        char[] usedChars = new char[input.length()];
        char[] repeatedChars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            boolean foundUsed = false;
            boolean foundRepeated = false;
            for (int k = 0; k < usedChars.length; k++) {
                if (usedChars[k] == input.charAt(i)) {
                    foundUsed = true;
                    break;
                }
            }
            for (int k = 0; k < repeatedChars.length; k++) {
                if (repeatedChars[k] == input.charAt(i)) {
                    foundRepeated = true;
                    break;
                }
            }
            if (!foundUsed) {
                usedChars[i] = input.charAt(i);
            }
            if (foundUsed && !foundRepeated) {
                repeatedChars[i] = input.charAt(i);
            }
        }
        for (int k = 0; k < input.length(); k++) {
            boolean foundRepeated = false;
            for (int h = 0; h < repeatedChars.length; h++) {
                if (repeatedChars[h] == input.charAt(k)) {
                    foundRepeated = true;
                }
            }
            if (!foundRepeated) return input.charAt(k);
        }
        return 'n';
    }
}
