import java.util.Scanner;

public class Lab08_Q4 {
    public static void main(String[] args) {
        String name;

        String answer = "Duffy Duck";
        do {

            Scanner sc = new Scanner(System.in);

            System.out.print("Guess my name:");

            name = sc.nextLine();

            System.out.println("Your answer " + name);

        } while (!name.equals(answer));

            System.out.print("You won!");

    }
}
