public class Line {
    
    private final double m;
    private final double b;

    public Line(double m, double b) {
        this.m = m;
        this.b = b;
    }

    public Line(double x, double y, double m) {
        this.m = m;
        this.b = y - (m * x);
    }

    public double getSlope() {
        return m;
    }

    public double getInterceptY() {
        return b;
    }

    public String toString() {
        String str = "y = ";
        str += m;
        str += "x + ";
        str += b;
        return str;
    }

    public double evaluateY(double x) {
        return (x * m) + b;
    }

    public double evaluateX(double y) {
        return (y - b) / m;
    } 

    public void printIntersection(Line line) {
        double x = findIntersectionX(this, line);
        double y = evaluateY(x);
        System.out.println("(" + x + ", " + y + ")");
    }

    private static double findIntersectionX(Line line1, Line line2) {
        double num = line1.b - line2.b;
        double dem = line2.m - line1.m;
        return (num / dem);
    }

}
