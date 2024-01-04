package practice_1;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1={10,20,30};
        int[] arr2={15,20,30,5,0};

        int[] arr3=new int[arr1.length+ arr2.length];

        int i=0;

        for (int each: arr1) {
            arr3[i++]=each;
        }


        for (int each: arr2) {
            arr3[i++]=each;
        }
        System.out.println(Arrays.toString(arr3));


    }
}

/**
 * Write a program that can combine two separate arrays into a single array.
 * The solution should handle arrays of varying lengths, and
 * maintain the order of elements from each array.
 *
 * EX:
 *      arr1={10,20,30}
 *      arr2={15,20,30,5,0}
 *
 *      OUTPUT:
 *      arr3={10,20,30,15,20,30,5,0}
 *
 */