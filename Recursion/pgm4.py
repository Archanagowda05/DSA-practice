def fun(n):
    if(n==11):
      return "biscuit"
    print(n)
    a=fun(n+1)
    print(n)
    return a
print(fun(1))