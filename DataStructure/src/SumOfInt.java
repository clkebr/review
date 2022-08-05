import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfInt {
/*given an array of int nums an int target, return indices of two numbers
* such that they add up to target
* each input would have one solution and may not use the same element twice
* return the answer in any order
*/
    public static void main(String[] args) {

//        String result = Arrays.toString(sumOfInt(new int[]{2, 7, 11, 15},9 ));
        String result = Arrays.toString(sumOfInt2(new int[]{2, 7, 11, 15},9 ));
        System.out.println(result);

    }
// this solution is little dirty because we need to n*n operator to check all values inside arr
    //time complexity O(n)
    public static int[] sumOfInt(int[] arr, int num){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]+arr[j]==num){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{};
    }

    //since duplicates not allowed use hashmap. if num-arr[i] exist return, if not put in map
    public static int[] sumOfInt2(int[] arr, int num){
        Map<Integer,Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            int target = num-arr[i];
            if(myMap.containsKey(target)) return new int[]{i,myMap.get(target)};
            else myMap.put(arr[i],i);
        }
        return new int[]{};
    }
}
