import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total marks: ");
        float total_marks= sc.nextFloat();
        System.out.print("Enter marks obtained in Maths: ");
        float math_marks=sc.nextFloat();
        System.out.print("Enter marks obtained in Physics: ");
        float phy_marks=sc.nextFloat();
        System.out.print("Enter marks obtained in Chemistry: ");
        float chem_marks=sc.nextFloat();
        float total_percentage=((math_marks+phy_marks+chem_marks)/total_marks)*100;
        float math_percentage=(math_marks/(total_marks/3))*100;
        float phy_percentage=(phy_marks/(total_marks/3))*100;
        float chem_percentage=(chem_marks/(total_marks/3))*100;
        if (total_percentage>=40 && math_percentage>=33 && phy_percentage>=33 && chem_percentage>=33)
        {
            System.out.println("You passed");
        }
        else
        {
            System.out.println("You failed");
        }
    }
    
}