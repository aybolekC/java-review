package practice_1;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str="ABCABCABC";

        String result="";

        //solution #1
        System.out.println("===========Solution #1===============");
        for (int i=0; i<str.length();i++){
            String ch=""+str.charAt(i);
         //   System.out.println(ch);

            if (result.contains(ch)){
                continue;
            }
            result+=ch;
        }

        System.out.println(result);


    }
}

/**
 * Write a program that can efficiently eliminate any duplicate characters present in a given string.
 * The solution should handle strings of varying lengths effectively and
 * preserve the original order of characters.
 *
 *  EX:
 *      str="ABCABCABC";
 *
 *      OUTPUT:
 *          ABC
 *
 */