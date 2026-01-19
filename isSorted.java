public class isSorted {
    public boolean Sorted(int[] arr) {
        int first =arr[0];
        int count=0; 
        for(int i=1;i<arr.length;i++){
            if (arr[i]>=first){
                first =arr[i];
                count++;
            }
            else{
              break;  
            }
        }
        if(count!=arr.length-1)
              return false;
            else 
              return true;
    }
}

