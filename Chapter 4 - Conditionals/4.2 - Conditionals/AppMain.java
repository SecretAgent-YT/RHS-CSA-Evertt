public class AppMain {

    public static final double EPSILON = 0.00000001;

    public static void main(String[] args) {
        Conditionals conditionals = new Conditionals();

        System.out.println("-------- firstStars --------");
        System.out.println(conditionals.firstStars("***"));
        System.out.println(conditionals.firstStars("boo"));

        System.out.println("------ compareDouble -------");
        System.out.println(conditionals.compareDouble(6.001, 6));
        System.out.println(conditionals.compareDouble(6.011, 6));

        System.out.println("-------- logicCheck --------");
        System.out.println(conditionals.logicCheck(11, 5, false));
        System.out.println(conditionals.logicCheck(9, 5, false));
        System.out.println(conditionals.logicCheck(9, 5, true));
        System.out.println(conditionals.logicCheck(5, 9, true));
    }
}
