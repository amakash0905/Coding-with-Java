import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
}
