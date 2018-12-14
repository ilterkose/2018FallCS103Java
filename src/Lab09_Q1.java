import java.util.*;

public class Lab09_Q1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Is it animal vegetable, or mineral? ");
    String answer1 = sc.nextLine();

    System.out.print("Is it bigger than a breadbox? ");
    String answer2 = sc.nextLine();

    if(answer1.equals("animal")){
      if(answer2.equals("bigger") || answer2.equals("yes"))
        System.out.println("moose");
      else
        System.out.println("squirrel");

    }else if(answer1.equals("vegetable")){
      if(answer2.equals("bigger") || answer2.equals("yes"))
        System.out.println("watermelon");
      else
        System.out.println("carrot");
    }else if(answer1.equals("mineral")){
      if(answer2.equals("bigger") || answer2.equals("yes"))
        System.out.println("Camaro");
      else
        System.out.println("paper clip");
    }else{
      System.out.println("You entered wrong word."); }
  }
}
