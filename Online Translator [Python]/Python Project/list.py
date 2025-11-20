i=int(input())
j=int(input())
k=int(input())
n=int(input())
for i in range(n):
    for j in range(n-i):
        for k in range(n-i-j):
            while (i+j+k)!=0:
                print(i,j,k)
                