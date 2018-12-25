import java.util.Scanner;

public class Lab10_Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        if(isPerfect(number) && isDivisbleBy3(number))
            System.out.println(number + "is a perfect number and divisible by 3.");
        else if(isPerfect(number) && !isDivisbleBy3(number))
            System.out.println(number + "is a perfect number but not divisible by 3");
        else if(!isPerfect(number) && isDivisbleBy3(number))
            System.out.println(number + "is not a perfect number but divisible by 3");
        else if(!(isPerfect(number)||isDivisbleBy3(number)))
            System.out.println(number + "is not a perfect number and not a divisible by 3");

    }
    public static boolean isPerfect(int number){
        int sum =0;
        for(int i=1;i<number;i++){
            if(number % i == 0 )
                sum += i;
        }
        return sum == number;
    }
    public static boolean isDivisbleBy3(int number){
        return number % 3 ==0;
    }
}
