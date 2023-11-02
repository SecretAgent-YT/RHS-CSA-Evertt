import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        // Create a Scanner object.
        // Asks the user to type their age, the current year, a future year, and their name.
        // Print out "<Name> will be <computed age> years old in <future year>".
        /*Scanner scanner = new Scanner(System.in);
        String name = promptString(scanner, "Name: ");
        int age = promptInt(scanner, "Age: ");
        int current = promptInt(scanner, "Current Year: ");
        int future = promptInt(scanner, "Future Year: ");
        int distance = future - current;
        System.out.println(name + " will be " + (age + distance) + " years old in " + future + ".");
        scanner.close();*/
        int j = 6;
        int ifinal = 0;
        for (int i = 0; i != j; i++) {
            i++;
            j--;
            System.out.println(i + " " + j);
        }
    }

    private static String promptString(Scanner scanner, String promptString) {
        System.out.print(promptString);
        return scanner.nextLine();
    }

    private static int promptInt(Scanner scanner, String promptString) {
        System.out.print(promptString);
        return scanner.nextInt();
    }   

}
