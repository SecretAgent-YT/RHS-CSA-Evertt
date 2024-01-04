public class GeometricSeries extends Series {
    
    private final int diff;
    private final int start;

    public GeometricSeries(int diff, int start) {
        this.diff = diff;
        this.start = start;
    }   

    @Override
    public int stepNum(int n) {
        return start * ((int) Math.pow(diff, n));
    }

}
