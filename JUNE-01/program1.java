problem statement:Write a Java Program to left rotate the elements of an array

Problem Description :

In this program, we need to rotate the elements of an array towards the left by the specified number of times. 
In the left rotation, each element of the array will be shifted to its left by one position and
the first element of the array will be added to end of the list.This process will be followed for a specified number of times.
Suppose if n is 1 then, all elements of the array will be moved to its left by one positio such that
second element of the array will take the first position, the third element will be moved to the second position and so on. 
The first element of the array will be added to the last of the array.



solution:

class Main {  
    public static void main(String[] args) {  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int n = 3;  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        for(int i = 0; i < n; i++){  
            int j, first;  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  
        System.out.println();  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
