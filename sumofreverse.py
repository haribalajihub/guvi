n=input()
sum=0
sum1=0
n1=n[::-1]
for i in n:
    sum=sum+int(i)

for j in n1:
    sum1=sum1+int(j)

su=str(sum)+str(sum1)

su=int(su)
temp=su
rev=0
while(su>0):
    dig=su%10
    rev=rev*10+dig
    su=su//10
if(temp==rev):
    print("yes") 
else:
    print("no")
