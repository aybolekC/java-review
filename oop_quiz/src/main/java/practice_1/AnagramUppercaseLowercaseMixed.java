package practice_1;

import java.util.Arrays;

public class AnagramUppercaseLowercaseMixed {

    public static void main(String[] args) {

//        Plesae verify the given strings are anagrams or not?
        String str1="Cat";
        String str2="Act";
//        Cat and Act

        char[] arr1=str1.toLowerCase().toCharArray();
        char[] arr2=str2.toLowerCase().toCharArray();


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        if (Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }

    }


}
