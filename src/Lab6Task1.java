import java.util.Scanner;

public class Lab6Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int x = sc.nextInt();
        System.out.print("Enter the Second number = ");
        int y = sc.nextInt();

        int result = 0;

        for (int i = x; i <= y; i++) {

            if(i % 2 == 0){
                result += Square(i);
            }
        }
        System.out.println("Square of numbers between " + x + " and " + y + " = " + result);

    }
    public static int Square(int x){
        return x*x;

    }
}
