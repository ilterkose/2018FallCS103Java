import java.util.Random;
import java.util.Scanner;

public class Exercise_AddingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int wrong = 0;
        int points = 0;

        while(wrong < 3){
           int result = play(sc,rand);
           if  (result > 0){
               points++;
           }else
               wrong++;
        }
        System.out.println("Your point: " +points);

    }
    public static int play(Scanner sc,Random rand){

        int countOfNumber = rand.nextInt(4)+2;
        int sum = rand.nextInt(10)+1;
        System.out.print(sum);

        for (int i=2;i <= countOfNumber;i++){
            int n = rand.nextInt(10)+1;
            sum += n;
            System.out.print(" + "+ n);
        }

        System.out.print(" = ");

        int answer = sc.nextInt();

        if (answer == sum)
            return 1;
        else
            System.out.println("Wrong the answer was = " +sum);
            return 0;
    }
}
