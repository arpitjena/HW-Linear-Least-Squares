public class LinearRegression {
    public static double calcM(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        
        for (double[] point : data) {
            double x = point[0];
            double y = point[1];
            sumX += x;
            sumY += y;
            sumXY += x * y;
            sumX2 += x * x;
        }
        
        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    public static double calcB(double[][] data) {
        int n = data.length;
        double sumX = 0, sumY = 0;
        
        for (double[] point : data) {
            sumX += point[0];
            sumY += point[1];
        }
        
        double meanX = sumX / n;
        double meanY = sumY / n;
        
        return meanY - calcM(data) * meanX;
    }
}

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
