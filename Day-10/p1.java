
We are given 3 strings: str1, str2, and str3. Str3 is said to be a shuffle of str1 and str2 if it can be formed by interleaving the characters of str1 and str2 in a way that maintains the left to right ordering of the characters from each string. For example, given str1="abc" and str2="def", str3="dabecf" is a valid shuffle since it preserves the character ordering of the two strings. So, given these 3 strings write a function that detects whether str3 is a valid shuffle of str1 and str2.


public class Main{ 
    static boolean isInterleaved (String A, String B, String C)  
    { 
        int i = 0, j = 0, k = 0; 
          
        // Iterate through all characters of C.  
        while (k != C.length())  
        {  
            
            if (i<A.length()&&A.charAt(i) == C.charAt(k))  
                i++;  
      
           
            else if (j<B.length()&&B.charAt(j) == C.charAt(k))  
                j++;  
      
                       else
                return false;  
              
            // Move C to next for next iteration  
            k++;  
        }  
       
        if (i < A.length() || j < B.length())  
            return false;  
      
        return true;  
    }  
  
    public static void main(String []args){ 
          
        String A = "str1 str2";  
        String B = "str3 str4";  
        String C = "str1 str2 str3 str4";  
        if (isInterleaved(A, B, C) == true)  
            System.out.printf("%s is interleaved of %s and %s", C, A, B);  
        else
            System.out.printf("%s is not interleaved of %s and %s", C, A, B); 
    } 
}