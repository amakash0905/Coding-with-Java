public class arr_max_element {
    public static void main(String[] args) {
        int[] arr = {66,45,34,33,21,87};
        int max=Integer.MIN_VALUE;
        for (int e : arr) {
            if(e>=max){
                max=e;
            }
        }
        System.out.println("Maximum element in array= "+max);
    }
}
