problem statement :
Python Program to cube sum of first n natural numbers

solution :
def sumOfSeries(n): 
    x = (n * (n + 1)  / 2) 
    return (int)(x * x) 
  
n=int(input("Enter number")) 
print(sumOfSeries(n))

output:
Enter number4
100
