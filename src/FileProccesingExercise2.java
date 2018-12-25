import java.util.*;
import java.io.*;


public class FileProccesingExercise2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("weather2.txt"));

        while (console.hasNext()) {
            if (console.hasNextDouble()) {
                double ege = console.nextDouble();
                System.out.print(ege);
            } else if (console.hasNextLine()) {
                String word = console.nextLine();
                System.out.println(word);
            } else {
                console.next();
            }
        }
    }
}