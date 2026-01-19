public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int max = arr[0];
        int second=-1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               second=max;
               max=arr[i];
           } else if(arr[i]<max && arr[i]>second){
               second=arr[i];
           }
        }
        return second;
    }
} 
