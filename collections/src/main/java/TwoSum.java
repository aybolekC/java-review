import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {

        int[] myArray={2,7,9,11};
        System.out.println(Arrays.toString(twoSum1(myArray, 9)));
        System.out.println("Optimal Solution........................");
        System.out.println(Arrays.toString(twoSum2(myArray, 9)));
    }


    //my brute force solution O(n2)
    public static int[] twoSum1(int[] array, int target){

        for (int i=0; i<array.length-1;i++){  //n
            for (int j=i+1; j<array.length; j++){  //n
                if(array[i]+array[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    //my Optima solution O(n)
    public static int[] twoSum2(int[] array, int target){

        //create a hashmap
        Map<Integer, Integer> map=new HashMap<>();

        //iterate over the array
        //if potential match exists return that indexes else put the array value and index to map
        for (int i=0; i<array.length; i++){
            int potentialMatch=target-array[i];

            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);

        }

        return new int[]{};
    }

}
