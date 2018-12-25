
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10_Q3 {
    public static void main(String[] args) throws FileNotFoundException {
                Scanner sc = new Scanner(new File("grades.txt"));
                int sum = 0;
                for(int i=1;i<=10;i++){
                    int grade = sc.nextInt();
                    sum += grade;
                }

                double avg = (double) sum /10;
                System.out.println("Total average is"+ avg);

        }
    }

