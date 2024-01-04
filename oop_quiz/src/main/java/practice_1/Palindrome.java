package practice_1;

public class Palindrome {
    public static void main(String[] args) {

        String str="LeVEl";

        String reversedStr="";

        for (int i=str.length()-1; i>=0; i--){
            reversedStr+=str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversedStr)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");
    }



}
/**
 * Write a program that determine whether a given String is a palindrome.
 *
 * A palindrome is a storing that reads the same forwards and backwards.
 * The solution should handle different lengths effectively, and handle case sensitivity appropriately.
 *
 * EX:
 *      str="Level"
 *
 *      OUTPUT:
 *      Palindrome
 */