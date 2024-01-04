package practice_1;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabccdee";

        String uniques="";

        //solution #1
        System.out.println("========= Solution #1================");
        for (int i=0; i<str.length();i++){
            char ch=str.charAt(i);

            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                uniques+=ch;
            }
        }

        System.out.println(uniques);



    }
}

/**
 * Write a program that can identify and return only the unique characters presented in a given string.
 * The solution should handle alphanumeric characters, whitespaces, and special characters.
 * It should also handle different string lengths effectively, and preserve the order of unique characters
 *
 * EX:
 *  str="aabccdee";
 *
 *  OUTPUT:
 *  bd
 */