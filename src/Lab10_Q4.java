import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10_Q4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("grades.txt"));
        int sum = 0;
        int count = 0;
        while(sc.hasNextInt()){
            int grade = sc.nextInt();
            sum += grade;
            count++;
        }

        double avg = (double) sum /count;
        System.out.println("Total average is"+ avg);

    }
}
