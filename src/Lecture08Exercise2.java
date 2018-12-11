import java.util.Scanner;

public class Lecture08Exercise2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        introduction();

        double subtotal = meals(sc);

        result(subtotal);

    }

    public static void introduction(){

        System.out.println(" Modify the Receipt program from previous slides.\n" +
                " Prompt for how many people, and each person's dinner cost.\n");
    }

    public static double meals(Scanner sc){

        System.out.print("How many people ate? ");

        int countOfPeople = sc.nextInt();

        double Subtotal = 0;

        for(int i=0; i < countOfPeople; i++){

            System.out.print("Person #" + (i+1) + ": How much did your dinner cost? ");

            double personCost = sc.nextDouble();

            Subtotal += personCost;
        }

        return Subtotal;
    }
    public static void result(double Subtotal){

        double tax = Subtotal * 0.08;

        double tip = Subtotal * 0.15;

        double total = tax + tip + Subtotal;

        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Tip:  $" + tip);
        System.out.println("Total: $" + total);
    }


}

/* Modify the Receipt program from previous slides.
Prompt for how many people, and each person's dinner cost.
Use static methods to structure the solution.


Example log of execution:

How many people ate? 4
Person #1: How much did your dinner cost? 20.00
Person #2: How much did your dinner cost? 15
Person #3: How much did your dinner cost? 30.0
Person #4: How much did your dinner cost? 10.00

Subtotal: $75.0
Tax: $6.0
Tip: $11.25
Total: $92.25 */