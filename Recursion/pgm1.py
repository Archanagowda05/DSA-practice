#print numbers from 1 to 10 using recursion
def fun(n):
   if(n==11):
     return
   print(n)
   fun(n+1)
fun(1)