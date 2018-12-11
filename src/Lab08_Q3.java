import java.util.Random;

public class Lab08_Q3 {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines() {
        Random rand = new Random();

        int lines = rand.nextInt(6) + 5;

        for (int i = 1; i <= lines; i++) {

            int length = rand.nextInt(80);

            for (int j = 1; j <= length; j++) {

                char letter = (char) (rand.nextInt(26) + 'a');

                System.out.print(letter);
            }
            System.out.println();
        }
    }
}