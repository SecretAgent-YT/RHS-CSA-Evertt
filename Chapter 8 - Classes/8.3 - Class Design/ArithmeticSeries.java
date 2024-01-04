public class ArithmeticSeries extends Series {
    
    private final int diff;
    private final int start;

    public ArithmeticSeries(int diff, int start) {
        this.diff = diff;
        this.start = start;
    }

    @Override
    public int stepNum(int n) {
        return start + (n * diff);
    }

}
