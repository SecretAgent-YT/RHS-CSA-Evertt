public abstract class Series {

    public abstract int stepNum(int n);

    public int generateSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stepNum(i);
        }
        return sum;
    }

    public String toString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += String.valueOf(stepNum(i));
            if (i != n - 1) {
                str += ", ";
            }
        }
        return str;
    }

}
