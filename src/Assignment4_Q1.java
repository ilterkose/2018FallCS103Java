import java.util.Scanner;

public class Assignment4_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length()!=0){
            if(isBalanced(s))
                System.out.println("Balanced");
            else
                System.out.println("Not balanced");

        }

    }
    public static boolean isBalanced(String s){
        int parentesescount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                parentesescount++;
            else if(s.charAt(i) == ')')
                parentesescount--;

        }
        return parentesescount == 0;
    }
}

