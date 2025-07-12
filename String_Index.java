import java.util.Scanner;

public class String_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println("Double Spaces at: "+str.indexOf("  "));
        System.out.println("Triple Spaces at: "+str.indexOf("   "));
    }
}
