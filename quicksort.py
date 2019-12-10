l=list(map(int,input().split()))
low=0
high=len(l)-1
def quicksort(l,low,high):
    if(low<high):
        pi=partition(l,low,high)
        quicksort(l,low,pi-1)
        quicksort(l,pi+1,high)
    
    
def partition(l,low,high):
    i=low-1
    pivot=l[high]
    for j in range(low,high):
        if(l[j]<=pivot):
            i=i+1
            l[i],l[j]=l[j],l[i]
    l[i+1],l[high]=l[high],l[i+1]
    return i+1
quicksort(l,low,high)
print(l)
