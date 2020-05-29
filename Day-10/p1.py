
problem statement :
      
python program that takes the input from user and calculate total number of lowercases and uppercases in the string.

solution :
      
string=input("Enter string:")
count1=0
count2=0
for i in string:
      if(i.islower()):
            count1=count1+1
      elif(i.isupper()):
            count2=count2+1
print("lowercase characters is:")
print(count1)
print("uppercase characters is:")
print(count2)


output :
      
Enter string:Rohan Vasista
lowercase characters is:12     
uppercase characters is:2
