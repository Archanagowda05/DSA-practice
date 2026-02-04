#print numbers from 1 to 10 n 10 to 1 using recursion
def fun(n):
    if(n==11):
        return 
    print(n)
    fun(n+1)
    print(n)
fun(1)