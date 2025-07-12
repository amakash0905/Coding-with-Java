import java.util.Scanner;

public class StringtoLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String str_new = str.toLowerCase();
        System.out.println("Your string in lower case: "+str_new);
    }
}
