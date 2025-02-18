public class LinearRegressionRunner {
    public static void main(String[] args) {
        double[][] data = {
            {1, 2}, {2, 2.8}, {3, 3.6}, {4, 4.5}, {5, 5.1}
        };

        double m = LinearRegression.calcM(data);
        double b = LinearRegression.calcB(data);

        System.out.println("Slope (m): " + m);
        System.out.println("Intercept (b): " + b);
    }
}
