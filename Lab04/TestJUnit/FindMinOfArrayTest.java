import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class FindMinOfArrayTest {


    @Test
    public void findMinOfArray() {
        int [] arr1 = {1, 3, 2 -4, -5};
        int [] arr2 = {1, Integer.MIN_VALUE, 2 -4, -5, 42};
        int [] arr3 = {1, 3, 2 -4, Integer.MAX_VALUE, 8, 10, 6, 100};
        int [] arr4 = {1, 10, 2 -4, -5, 10, 12, 4, 21 };
        int [] arr5 = {1, -9, 2 -4, -5, 5, 234, 242};
        try {


            assertEquals(-5, FindMinOfArray.findMinOfArray(arr1));
            assertEquals(Integer.MIN_VALUE, FindMinOfArray.findMinOfArray(arr2));
            assertEquals(100, FindMinOfArray.findMinOfArray(arr3));
            assertEquals(-5, FindMinOfArray.findMinOfArray(arr4));
            assertEquals(-9, FindMinOfArray.findMinOfArray(arr5));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}