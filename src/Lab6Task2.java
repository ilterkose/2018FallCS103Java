import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number please");
        double a = sc.nextInt();

        System.out.println(Sum(a));
        System.out.print(Average(a));

    }
    public static double Sum(double a){
        double result = 0;

        for (int i=0;i<a;i++){
            result +=i;
        }
        return result;
    }
    public static double Average(double a){
        double average = Sum(a) / (a);
        return average;

    }
}
