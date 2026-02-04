def fun(n,s,h,d):
    if n==1:
        print("move",n,"from",s,"to",d)
        return
    fun(n-1,s,d,h)
    print("move",n,"from",s,"to",d)
    fun(n-1,h,s,d)
fun(20,"source","helper","dest")