//check max number of consecutive zeros or ones in an array
public class maxConsecBits {
    public int maxConsecBits(int[] arr) {
        int max=0;
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
                count1=0;
            }
            else if(arr[i]==0){
                count1++;
                max=Math.max(max,count1);
                count=0;
            }
        }
        return max;
    }
}
/*check max number of consecutive ones in an array
public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    } */