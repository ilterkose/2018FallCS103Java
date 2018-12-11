public class Assignment3_Q1 {
    public static void main(String[] args){
        System.out.println("Result of Gaussian Normal Distribution: " + calculateGaussian(5,6,7));
    }
    public static double calculateGaussian(double x,double mean,double standartDeviation){
        double y = Math.pow(1 / (standartDeviation * Math.pow(Math.sqrt(2 * Math.PI),Math.E)),(Math.pow(x-mean,2))/(2 * (Math.pow(standartDeviation,2))));
        return y;
    }
}
