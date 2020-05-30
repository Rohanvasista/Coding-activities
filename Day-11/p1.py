problem statement :

Python program to read a number and print the pattern

solution :

rows = int(input("Enter the number of rows "))
for i in range(rows + 1, 0, -1):
    for j in range(0, i - 1):
        print("*", end=' ')
    print(" ")

output :

Enter the number
5
* * * * * 

* * * * 

* * * 

* * 

*
