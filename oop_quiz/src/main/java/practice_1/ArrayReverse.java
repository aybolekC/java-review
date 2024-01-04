package practice_1;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr={10, 5, 30, 15, 0};

        int[] newArr=new int[arr.length];

        for (int i= arr.length-1, j=0; i>=0; i--, j++){
//            System.out.println(arr[i]);
            newArr[j]=arr[i];
        }

        System.out.println(Arrays.toString(newArr));

    }
}

/**
 * Write a program that can reverse a given array. It should accurately preserve the elements order,
 * and handle arrays of varying lengths
 *
 * EX:
 *      arr={10, 5, 30, 15, 0}
 *
 *      OUTPUT:
 *      newArr={0,15,30,5,10}
 */
