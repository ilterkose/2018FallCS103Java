import java.util.Scanner;

public class BooleanExercises {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Birinci kelime:");
      String word1= sc.nextLine();
      System.out.print("İkinci kelime:");
      String word2 = sc.nextLine();

      System.out.println(isRhyme(word1,word2));
      System.out.println(isAllendrome(word1,word2));
    }
    public static boolean isRhyme(String word1,String word2){
        if(word2.length() >= 2 && word1.endsWith(word2.substring(word1.length()-2)))
            return true;
        else
            return false;
    }
    public static boolean isAllendrome(String word1,String word2){
        if(word1.startsWith(word2.substring(0,1)))
            return true;
        else
            return false;
    }
}


