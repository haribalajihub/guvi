while True:
    try:
        l=list(map(int,input().split()))
        for j in range(len(l)):
            for i in range(len(l)-1):
                if(l[i]>l[i+1]):
                    l[i],l[i+1]=l[i+1],l[i]
        print(l)
        break
    except ValueError:
        print("only integers")
