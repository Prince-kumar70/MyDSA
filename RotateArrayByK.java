import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        rotate(arr,k);
        System.out.println("Rotated array:  " + Arrays.toString(arr));
    }

    public static void rotate(int[] arr , int k){
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        for(int r=1 ; r<=k ; r++){                 // no. of times rotate
            int temp = arr[arr.length-1];
            for(int i=arr.length-2 ; i>=0 ; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }
    }
}
