problem statement : Python Program to Exchange the Values of Two Numbers using ^ (exclusive or operator)

solution:
  
x=int(input("x= "))
y=int(input("y= "))
print ("Before Swapping: x = ", x, " y =", y)
x = x ^ y;
y = x ^ y;
x = x ^ y;
print ("After Swapping: x = ", x, " y =", y)


Output:
  
x= 77
y= 66
Before Swapping: x =  77  y = 66
After Swapping: x =  66  y = 77