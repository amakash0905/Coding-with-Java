public class array1 {
    public static void main(String[] args) {
        float[] arr = {3.4f,45.7f,33.67f,9.8f,13.21f};
        float sum =0;
        for(float e:arr)
        {
            sum+=e;
        }
        System.out.println("Sum of array elements= "+sum);
    }
}
