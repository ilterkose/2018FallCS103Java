import java.io.*;
import java.util.*;

public class FileProcessingExercise {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("weather.txt"));

        while (sc.hasNextDouble()) {
            double number = sc.nextDouble();
            System.out.println(number);
        }

        }
}

