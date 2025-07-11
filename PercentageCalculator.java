import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in English: ");
        float marks_eng=sc.nextFloat();
        System.out.print("Enter marks in Maths: ");
        float marks_math=sc.nextFloat();
        System.out.print("Enter marks in Physics: ");
        float marks_phy=sc.nextFloat();
        System.out.print("Enter marks in Chemistry: ");
        float marks_chem=sc.nextFloat();
        System.out.print("Enter marks in Biology: ");
        float marks_bio=sc.nextFloat();
        float percentage= ((marks_eng+marks_math+marks_phy+marks_chem+marks_bio)/500)*100;
        System.out.print("Pecentage Marks = ");
        System.out.print(percentage);
        System.out.println("%");
    }
}
