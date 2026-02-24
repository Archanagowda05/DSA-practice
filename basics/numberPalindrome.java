public class numberPalindrome {

    public boolean isPalindrome(int x) {
        int temp=x;
        int n=0;
       while(x!=0)
       {
           n=n*10+x%10;
           x=x/10;
       }
       if(temp!=n || n<0)
          return false;
       else 
          return true;
    }
}
