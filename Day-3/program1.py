
x=int(input("x= "))
y=int(input("y= "))
print ("Before Swapping: x = ", x, " y =", y)
x = x ^ y;
y = x ^ y;
x = x ^ y;
print ("After Swapping: x = ", x, " y =", y)
