problem statement:python program to remove duplicates in list

solution:
def Remove(duplicate): 
    final_list = [] 
    for num in duplicate: 
        if num not in final_list: 
            final_list.append(num) 
    return final_list 
duplicate = [1,2,3,3,4,5,5,6] 
print(Remove(duplicate))

output:
[1,2,3,4,5,6]