import java.util.Scanner;

public class Lecture08Exercise {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        introduction();

        double bmi1 = Person(sc);

        double bmi2 = Person(sc);

        report(1,bmi1);

        report(2,bmi2);

        System.out.println("Difference: "+ (bmi1 - bmi2));


    }

    public static void introduction(){

        System.out.println("This program reads data for two people and\n" +
                "computes their body mass index (BMI).");
    }

    public static double Person(Scanner sc ){

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.println("Person : Weight: " + weight + " Height:" + height);

        double bodymass = bmiCalculator(weight,height);

        return bodymass;


    }

    public static double bmiCalculator(double weight, double height){

        return (weight / (height * height)) * 703 ;

    }
     public static void report(int number,double bmiCalculator){

        System.out.println("Person " + number + " BMI = " + bmiCalculator);

        if (bmiCalculator < 18.5){
            System.out.println("Underweight");
        }
        else if (bmiCalculator < 25){
            System.out.println("Normal");
        }
        else if (bmiCalculator < 30){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
     }

}


   /* Write a program that produces output like the following:
        This program reads data for two people and
        computes their body mass index (BMI).

        Enter next person's information:
        height (in inches)? 70.0
        weight (in pounds)? 194.25

        Enter next person's information:
        height (in inches)? 62.5
        weight (in pounds)? 130.5

        Person 1 BMI = 27.868928571428572
        overweight
        Person 2 BMI = 23.485824
        normal
        Difference = 4.3831045714285715 */