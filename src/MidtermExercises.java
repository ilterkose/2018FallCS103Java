import java.util.Scanner;

public class MidtermExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type your number");

        int x = sc.nextInt();
        System.out.println(digitSum(x));
    }

    public static void ProcessName(String input) {
        if (input.length() > 5 && input.contains(" ")) {
            int space = input.indexOf(" ");

            String lastName = input.substring(space);

            char firstLetter = input.charAt(0);

            String name = lastName + "," + firstLetter + ".";

            System.out.println(name);

        } else {
            System.out.println("Error, must be at leats 5 chars with space");

        }
    }
    public static int digitSum(int x){
        x = Math.abs(x);
        int sum = 0;
        if (x == 0){
            return 0;
        }else{
            while (x > 0){
                sum += x %10;
                x = x / 10;
            }
        }
        return sum;
    }
}