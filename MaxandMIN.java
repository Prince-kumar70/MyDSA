package MyDSA;

public class MaxandMIN {
    
    public static void main(String[] args) {
        
        int[] arr = {3,5,4,1,9,8};
        MaxElement(arr);
        MinElement(arr);
    }

    public static void MinElement(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void MaxElement(int[] arr){

        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
