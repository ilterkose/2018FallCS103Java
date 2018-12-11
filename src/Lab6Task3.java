import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade : ");
        int grade = sc.nextInt();

        GradeController(grade);

    }
    public static void GradeController(int grade){
        if (grade >= 60 ){
            System.out.println("You passed the course");
        }
        else {
            System.out.println("Unfortunately, you failed the course");
        }
    }
}
