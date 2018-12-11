import java.util.Scanner;

public class Lab07_Q3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side");
        int x = sc.nextInt();
        System.out.println("Enter second side");
        int y = sc.nextInt();
        System.out.println("Enter third side");
        int z = sc.nextInt();

        printTriangleType(x,y,z);

    }
    public static boolean printTriangleType(int x, int y, int z){
        if (x > (y+z) || z > (x+y) || y > (x+z) ) {
            System.out.println("illegal triangle");

        }
        else if(x == z && y != z ){
          System.out.println("isosceles");
        }
        else if (x == z && y == z){
            System.out.println("equilateral");
        }
        else {
            System.out.println("scalane");
        }

      return true;
    }
}
