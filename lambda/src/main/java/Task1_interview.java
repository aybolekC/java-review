import java.util.Arrays;

public class Task1_interview {


    public static void main(String[] args) {

//        Plesae verify the given strings are anagrams or not?
        String str1="Cat";
        String str2="Act";
//        Cat and Act

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

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
