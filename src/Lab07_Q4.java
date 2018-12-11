import java.util.Scanner;

public class Lab07_Q4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word");
        String originalWord = sc.next();

        System.out.println(isPalindrome(originalWord));


    }
    public static boolean isPalindrome(String originalWord){
        String reverse = "";
        for(int i=originalWord.length()-1;i>=0;i--){
            reverse = reverse + originalWord.charAt(i);
        }
        System.out.println(reverse);
        if (originalWord.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}
