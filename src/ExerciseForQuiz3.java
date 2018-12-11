import java.util.Scanner;

public class ExerciseForQuiz3 {
    public static void main(String[] args){
        Square(7);
   }
    public static void Square(int X){
        int evens=0;
        for(int i=1;i <= X ; i++){
            int calculation = i*i;
            System.out.print(calculation + " ");
            if(calculation % 2 == 0){
                evens++;
            }
        }
        System.out.println("There are"+evens + "evens in square of " + X);
    }
}



