import java.util.Scanner;

public class Lab07_Q1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(getArea(sc));

        System.out.println(getCircumference(sc));


    }

    public static double getArea(Scanner sc){

        double r = sc.nextInt();

        double result = Math.PI * Math.pow(r,2);

        return result;

    }

    public static double getCircumference(Scanner sc){

        double r = sc.nextInt();

        double circumference = 2 * Math.PI * r;

        return circumference;

    }
}
