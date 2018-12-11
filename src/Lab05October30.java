import java.util.*;

public class Lab05October30 {
    public static final String LIFE = "Life is a";
    public static final String IM = "I am ";
    public static final String IT = "it";

    public static void main (String[] args) {
        //ThirdQuestion();
        //IndexFinder();
    }
    public static void tryPrimitives(int i, int b, double y,String text) {

        i=i*10;
        b=b-10;
        y=0.45;
        text = "Sam";


    }

    public static void textGenerator(String firstLetter,String secondLetter){
        System.out.println("Life is a " + firstLetter +"," +
                           "I am "+ secondLetter +  " it");
    }

    public static void ThirdQuestion() {
        Scanner console = new Scanner(System.in);

        System.out.println("Which city are you living in?");
        String city = console.next();
        System.out.println("cevap" + city);

        System.out.println("What is 10 multiply by 10");
        int result = console.nextInt();
        System.out.println(result);

        System.out.println("What is your favorite color");
        String color = console.next();
        System.out.println("cevap" + color);

        System.out.println("Enter number between 0.1 and 0.9");
        double number = console.nextDouble();
        System.out.println(number);

    }
    public static void IndexFinder() {
        Scanner finder = new Scanner(System.in);


        System.out.println("Write your sentence");

        String sentence = finder.nextLine();

        int length = sentence.length();

        System.out.println(sentence.indexOf("a"));
        System.out.println(sentence.indexOf("b"));
        System.out.println(sentence.indexOf("c"));
        System.out.println(sentence.indexOf("d"));
        System.out.println(sentence.indexOf("e"));
        System.out.println(sentence.indexOf("f"));
        System.out.println(sentence.indexOf("g"));
        System.out.println(sentence.indexOf("h"));


    }

    }
