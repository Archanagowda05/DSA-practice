//Missing Number in Array LeetCode
//optimal approach using sum of n natural numbers formula
public class MissingNumber {
    public int missingNumber(int[] nums) {
       int sum=0 ,sum1=0;
       int n=nums.length;
       sum=(n*(n+1))/2;
       for(int i=0;i<n;i++){
          sum1+=nums[i];
       }
       return (sum-sum1);
    }
}
//optimal approach using XOR
/*class MissingNumber {
    public int missingNumber(int[] nums) {
       int xor1=0 ,xor2=0;
       int n=nums.length;
       for(int i=1;i<=n;i++){
        xor1^=i;
       }
       for(int i=0;i<=n-1;i++){
          xor2^=nums[i];
       }
       return (xor1^xor2);
    }
} */
/*brute force approach
public class MissingNumber {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       for(int i=1;i<n;i++){
          int flag=0;
          for(int j=0;j<=n-1;j++){
            if (nums[j]==i){
               flag=1;
               break;
            }
          }
          if(flag==0)
            return i;
        }
    return n;
    }
}*/
