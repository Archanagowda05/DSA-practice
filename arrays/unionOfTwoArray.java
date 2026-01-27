//gfg union of two sorted array brute force approach
public class unionOfTwoArray {
    int n1=a.length;
    int n2=b.length;
    
    Set<Integer> set = new TreeSet<>();
    for(int i=0;i<n1;i++)
      set.add(a[i]);
    for(int i=0;i<n2;i++)
      set.add(b[i]);
    ArrayList<Integer> union=new ArrayList<>();

    for(int x:set)
       union.add(x);
    return union;
    }
}
