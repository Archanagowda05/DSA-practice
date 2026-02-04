def fun(n,i,curr):
    if i==len(n):
      print(curr)
      return 
    fun(n,i+1,curr)
    fun(n,i+1,curr+n[i])
print(fun("abc",i=0,curr=""))