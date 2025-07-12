import java.util.Scanner;

public class String_Replace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String str_new = str.replace(" ", "_");
        System.out.println("Your string without spaces: "+str_new);
    }
}
    