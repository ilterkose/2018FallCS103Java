import java.util.Scanner;

public class printfExercise {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double wage = sc.nextDouble();
      System.out.printf("You entered: $%520.2f", wage);
    }
}
