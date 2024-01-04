package practice_1;

public class MaxMinArray {

    public static void main(String[] args) {
        int[] arr1={10, 5, -4, -20, 15};

        int max=arr1[0];
        int min=arr1[0];

        for (int each: arr1) {
            if(each>max){
                max=each;
            }

            if(each<min){
                min=each;
            }
        }

        System.out.println("Maximum number is: " +max);
        System.out.println("Minimum number is: " +min);
    }
}
