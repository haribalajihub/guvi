A =list(map(int,input().split()))
for i in range(len(A)): 
	key = i 
	for j in range(i+1, len(A)): 
		if A[key] > A[j]: 
			key = j 
	A[i], A[key] = A[key], A[i] 
print(A)
