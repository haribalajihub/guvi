n=int(input())
a=input().split()
l=[]
for i in range(0,len(a)):
    for j in range(i+1,len(a)):
        if(a[i]==a[j]):
            l.append(a[j])
if(len(l)==0):
    print("unique")
else:
    print(l[0])
