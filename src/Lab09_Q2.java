import java.util.*;

public class Lab09_Q2 {
  public static void main(String[] args){
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("Guessing game guess a number: ");
    int answer = sc.nextInt();
    int tries = 0;

    int randomword = rand.nextInt(10) + 1;

    while (answer != randomword){
      System.out.print("Thats is incorrect. Guess again: ");
      answer = sc.nextInt();
      tries++;
  }

    System.out.println("It only took " + tries + " tries");


}
}
