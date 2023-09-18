public class DecompositionMainA {
    public static void main(String[] args) {
        /*
        System.out.println("  /\\" );
        System.out.println(" /  \\" );
        System.out.println("/    \\" );
        System.out.println("\\    /" );
        System.out.println(" \\  /" );
        System.out.println("  \\/" );
        System.out.println("  /\\" );
        System.out.println(" /  \\" );
        System.out.println("/    \\" );
        System.out.println("\\    /" );
        System.out.println(" \\  /" );
        System.out.println("  \\/" );
         */
        sequenceA();
        sequenceB();
        sequenceA();
        sequenceB();
    }

    private static void sequenceA() {
        System.out.println("  /\\" );
        System.out.println(" /  \\" );
        System.out.println("/    \\" );
    }

    private static void sequenceB() {
        System.out.println("\\    /" );
        System.out.println(" \\  /" );
        System.out.println("  \\/" );
    }

}
