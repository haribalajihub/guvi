n=input()
sum=0
for i in n:
    sum=sum+int(i)**3
if(sum==int(n)):
    print("yes")
else:
    print("no")
   
   
"""
n=int(input())
temp=n
sum=0
while(temp>0):
    di=temp%10
    sum=sum+di**3
    temp=temp//10

if(sum==n):
    print("yes")
else:
    print("no")
"""
