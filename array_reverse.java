public class array_reverse {
    public static void main(String[] args) {
        float[] arr = {3.4f,45.7f,33.67f,9.8f,13.21f};
        int n=Math.floorDiv(arr.length, 2);
        int l=arr.length;
        for (int i=0;i<n;i++){
            float temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        System.out.println("Reversed array: ");
        for (float f : arr) {
            System.out.print(f+" ");
        }
    }
}
