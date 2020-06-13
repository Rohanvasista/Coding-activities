problem statement:
Python Program to print the pattern of alphabets


solution:
for i in range(65,70):
    k=i
    for j in range(65,i+1):
        print(chr(k),end=" ")
        k=k+1
    print()
    
output:
C D E
D E F G
E F G H I
