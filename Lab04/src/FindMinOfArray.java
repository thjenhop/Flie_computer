
import java.util.Vector;

public class FindMinOfArray {

    public static int findMinOfArray(int [] arr){
        int MIN = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < MIN){
                MIN = arr[i];
            }
        }
        return MIN;
    }
}
