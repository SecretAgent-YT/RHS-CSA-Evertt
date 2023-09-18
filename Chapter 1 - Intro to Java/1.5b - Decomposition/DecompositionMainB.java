public class DecompositionMainB {
    public static void main(String[] args) {
        /*
        System.out.println("   /\\" );
        System.out.println("  /  \\" );
        System.out.println(" /    \\" );
        System.out.println("+------+" );
        System.out.println("|      |" );
        System.out.println("|      |" );
        System.out.println("+------+" );
        System.out.println("|UNITED|" );
        System.out.println("|STATES|" );
        System.out.println("+------+" );
        System.out.println("|      |" );
        System.out.println("|      |" );
        System.out.println("+------+" );
        System.out.println("   /\\" );
        System.out.println("  /  \\" );
        System.out.println(" /    \\" );*/
        sequenceA();
        sequenceB();
        sequenceC();
        sequenceC();
        sequenceB();
        System.out.println("|UNITED|" );
        System.out.println("|STATES|" );
        sequenceB();
        sequenceC();
        sequenceC();
        sequenceB();
        sequenceA();
    }

    private static void sequenceA() {
        System.out.println("   /\\" );
        System.out.println("  /  \\" );
        System.out.println(" /    \\" );
    }

    private static void sequenceB() {
        System.out.println("+------+" );
    }

    private static void sequenceC() {
        System.out.println("|      |" );
    }

}
