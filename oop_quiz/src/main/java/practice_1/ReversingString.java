package practice_1;

public class ReversingString {

/**
 * Write a program that can reverse a given string.
 * The solution should accurately preserve the character order,
 * including whitespace and special characters, while maintaining case sensitivity.
 * In addition, the solution should handle Strings of varying lengths.
 *
 * EX:
 *      str="Java Programming"
 *
 *      OUTPUT:
 *      reversedStr="gnimmargorp avaJ"
 */

public static void main(String[] args) {

    String str="Java Programming";
    String reversedStr="";

    //solution #1
    System.out.println("===============Solution #1===========");

    for (int i=str.length()-1; i>=0;i--){
        reversedStr+=str.charAt(i);
    }

    System.out.println(reversedStr);
}

//String builder and String buffer have built in methods to revert backward the string

}
