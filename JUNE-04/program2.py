problem statement :

Python program to print frequency of alphabets in a string in a specific format


solution:

s = input("Enter the string\n")
s = sorted(s)
a = {}
for i in s:
  if i in a:
    a[i] += 1
  else:
    a[i] = 1
for key,val in a.items():
  print(key,val)        
    

Output:

Enter the string
rohan
n 1
h 1
a 1
o 1
r 1
