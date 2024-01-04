package practice_1;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}

/**
 * Write a program that can determine whether two given strings are anagrams of each other.
 * An anagram is a word or phrase formed by rearranging the letters of another word or phrase.
 * The solution should handle strings of varying lengths, including whitespace and punctuation marks.
 *
 * EX:
 *      str1="heart"
 *      str2="earth"
 *
 *      OUTPUT:
 *      Anagram
 */
