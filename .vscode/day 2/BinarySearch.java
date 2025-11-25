public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 10;
        int flag = -1;
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                flag = mid;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
                }
             else if (key <= arr[mid]) {
                high = mid -1;
                }
            } 
        
            if(flag!=-1)
                System.out.println("The " + key + " is present in " + flag + "th index");
            else
                System.out.println("key " + key + " not found");
        }
    }
