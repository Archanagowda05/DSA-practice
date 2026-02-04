#check if a number is power of 2 using recursion
def fun(n):
    if(n==1):
      return True
    if(n<=1):
        return False
    return fun(n/2)
print(fun(8))