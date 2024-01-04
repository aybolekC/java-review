package practice_1;

public class SumOfDigits {

    public static void main(String[] args) {

        String str="A1B2C3D4";
        int sum=0;
        for (int i=0; i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isDigit(ch)){
                sum+=Integer.parseInt(""+ch);
            }

        }

        System.out.println(sum);


    }
}

/**
 * Write a program that calculate the sum of the digits present in a given string.
 *
 * EX:
 *      str="A1B2C3D4";
 *
 *      OUTPUT:
 *      10
 */
