import java.util.Scanner;

public class Assignment3_Q2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String sentence1 = sc.nextLine();
        String sentence2 = sc.nextLine();

        System.out.println(compareNumbers(sentence1,sentence2));

    }

    public static int extractNumber(String sentence1){

        int dotIndex = sentence1.indexOf(":");
        String number = sentence1.substring(dotIndex + 2);

        return Integer.parseInt(number);

    }

    public static int compareNumbers(String sentence1, String sentence2){

        int dotIndex1 = sentence1.indexOf(":");
        String number1 = sentence1.substring(dotIndex1 + 2);

        int dotIndex2 = sentence2.indexOf(":");
        String number2 = sentence2.substring(dotIndex2 + 2);

        int integerofNumber1 = Integer.parseInt(number1);
        int integerofNumber2 = Integer.parseInt(number2);

        if (integerofNumber1 > integerofNumber2)
            return integerofNumber1;
        else
            return integerofNumber2;

    }


}
