import java.util.ArrayList;
//Return arraylist with no duplicates You are given a sorted array arr[] containing positive integers. Your task is to remove all duplicate elements from this array such that each element appears only once. Return an array containing these distinct elements in the same order as they appeared.
public class NoDuplicateArraylist {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> noduplicate=new ArrayList<>();
        if (arr.length==0) return noduplicate;
        noduplicate.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                noduplicate.add(arr[i]);
            }
        }
        return noduplicate;
    }
}
