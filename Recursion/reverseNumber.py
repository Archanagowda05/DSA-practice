def fun(n,rev):
    if(n==0):
      return rev
    rem=n%10
    rev=rev*10+rem
    return fun(n//10,rev)
print(fun(1234,rev=0))