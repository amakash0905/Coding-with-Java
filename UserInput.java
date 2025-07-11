import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        System.out.print("Enter your Age: ");
        int age= sc.nextInt();
        System.out.print("Your name is: ");
        System.out.println(name);
        System.out.print("Your age is: ");
        System.out.println(age);
    }    
}
