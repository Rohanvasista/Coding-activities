
python program that takes the input from user and calculate total number of lowercases and uppercases in the string.


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
