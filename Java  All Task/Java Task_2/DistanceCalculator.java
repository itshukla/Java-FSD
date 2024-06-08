public class DistanceCalculator {

     static double calculateDistance(double x1, double y1, double x2, double y2) {
       
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static void main(String[] args) {

        double x1 = 12.0;
        double y1 = 10.0;
        double x2 = 9.0;
        double y2 = 8.0;

        System.out.println(calculateDistance(x1, y1, x2, y2));
    }
}

