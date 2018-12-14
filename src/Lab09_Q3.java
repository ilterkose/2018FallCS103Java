import java.util.*;

public class Lab09_Q3 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int side1,side2,side3;
    double triangle_test;

    System.out.println("Enter 3 sides of triangle");
    System.out.print("Enter side1: ");
    side1 = sc.nextInt();


    do {

      System.out.print("Enter side2: ");
      side2 = sc.nextInt();
      if (side1>side2)
        System.out.println(side2 + "is smaller than " + side1 + "please try again.");

    } while (side1>side2);

    do {
      System.out.print("Enter side3: ");
      side3 = sc.nextInt();
      if (side2>side3)
        System.out.println(side3 + "is smaller than " + side2 + "please try again.");
    }while(side2>side3);

    System.out.println("Your three sides are: " + side1 +" "  + side2+" " + side3);

    triangle_test = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));


    if (triangle_test == side3)
      System.out.println( "These sides *do* make a right triangle. Yippy-skippy!" );
    else
      System.out.println( "NO! These sides do not make a right triangle!" );

  }
}
