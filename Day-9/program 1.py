problem statement :
    
python program to get digit root of number where we give a random number and until it become complete single digit it goes on calculate
    
solution :
        
num = input()
def droot(num):
    if len(num) == 1:
        return num
    else:
        sum = 0
        for i in num:
            sum += int(i)
        num = str(sum)
        return droot(num)
print("The digital root of ", num, "is: ",        
droot(num))


output :
    
16
The digital root of 16 is:7
