class pushZerosToEnd {
    void pushZerosToEnd(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i]=0;
        }
    }
}

/* using extra array
class Solution {
    public void moveZeroes(int[] nums) {
        
        int result[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
              result[j]=nums[i];
              j++;
            }
        }
        for(int i=j;i<nums.length;i++){
          result[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=result[i];
        }
    }
}*/