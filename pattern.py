'''n=int(input())
l=[]
v=[]
for j in range(1,n+1):
    o="* "*j
    l.append(o)
    print(o)
for i in range(n+1,-1,-1):
    n="* "*i
    v.append(n)
    print(n)
print(l)
for h in l:
    print(h[::-1])
ji=5
for p in range(n):
    for k in range(2*n):
        if(k>ji):
            x="* "*k
            print(x)
            ji=ji-1
    else:
        x=" " '''
        
n=int(input())
o=1
for i in range(0,n+1):
    n1=(n-i)*" " + "* "*i
    print(n1)
for j in range(n-1,-1,-1):
    n2=(o)*" "+ "* "*j
    o=o+1
    print(n2)
