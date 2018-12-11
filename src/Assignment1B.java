import java.util.Scanner;

public class Assignment1B {
    public static final double PI = 3.14;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the R value: ");
        int r = sc.nextInt();
        System.out.print("Enter the H value: ");
        int h = sc.nextInt();

        System.out.print("1 For AreaCalculation or press any button to calculate volume ");
        int des = sc.nextInt();

        if (des == 1){
            calculateArea(r,h);
        }
        else{
            calculateVolume(r,h);

        }

    }
    public static void calculateArea(int r, int h){
        double area = 0;
        area = (2 * PI * Math.pow(r,2)) + (2 * PI * r * h);
        System.out.println("Area: " + area);
    }

    public static void calculateVolume(int r, int h){
        double volume = 0;
        volume = (PI * Math.pow(r,2) * h);
        System.out.println("Volume: " + volume);
    }
}

     /*The area
            (A) and volume (v) of cylinder are
        calculated according to the following fo
        r
        mulas:
        A = 2π r2 + 2 π r h
        V = π r2 h
        */