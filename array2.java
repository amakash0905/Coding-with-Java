import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        float[] arr = {3.4f,45.7f,33.67f,9.8f,13.21f};
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num=sc.nextFloat();
        boolean numIsPresent=false;
        for(float e:arr){
            if(num==e){
                numIsPresent=true;
                break;
            }
        }
        if(numIsPresent){
            System.out.println(num+" is present in the array.");
        }
        else{
            System.out.println(num+" is not present in the array.");
        }
    }
}
