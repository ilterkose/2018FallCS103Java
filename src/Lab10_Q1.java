import java.util.*;
public class Lab10_Q1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter midterm grade:");
    double midtermGrade = sc.nextDouble();
    System.out.print("Enter final grade:");
    double finalGrade = sc.nextDouble();
    System.out.print("Enter project grade:");
    double projectGrade = sc.nextDouble();

    System.out.println( "\nHas the student passed the course?");

    if(isPass(midtermGrade,finalGrade,projectGrade))
      System.out.println("Yes, the student passed!");
    else
      System.out.println("No, the student failed!");

      System.out.println( "\nHas the student failed the course?");

    if(isNotPass(midtermGrade,finalGrade,projectGrade))
      System.out.println("Yes, the student failed!");
    else
      System.out.println("No, the student passed!");

  }
  public static boolean isPass(double p_mid,double p_final,double p_project){
    return (p_mid >=15 && p_final >=25 && p_project >=10);
  }
  public static boolean isNotPass(double p_mid,double p_final,double p_project){
    return (!(p_mid >=15) || !(p_final >=25) || !(p_project >10));
  }
}
