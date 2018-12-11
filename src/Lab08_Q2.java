import java.util.Scanner;

public class Lab08_Q2 {
    public static void main(String[] args) {

        int payment = 0;

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("Enter name or write \" stop \" to stop:  ");

            String name = sc.next();


            if (name.equals("stop")){
                break;
            }else {
                System.out.println("You entered: " + name);

                System.out.print("Enter the payment: ");

                int weeklyPay = sc.nextInt();

                System.out.println("You entered payment: " + weeklyPay);
                payment += weeklyPay;
            }

        }
    System.out.println("The amount you have to pay to the employee is " + payment + " TL in Total");
    }
}