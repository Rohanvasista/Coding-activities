problem statement :

write a java program to Count number of trailing zeros in product of array


solution :

import java.util.*; 
import java.lang.*; 
public class Main 
{ 
	public static int countZeroso(int[] a, int n) 
	{ 
		int count2 = 0, count5 = 0; 
		for (int i = 0; i < n; i++) 
		{ 
			while (a[i] % 2 == 0) 
			{ 
				a[i] = a[i] / 2; 
				count2++; 
			}
			while (a[i] % 5 == 0) 
			{ 
				a[i] = a[i] / 5; 
				count5++; 
			} 
		} 
		return (count2 < count5) ? count2 : count5; 
	} 
	
	public static void main(String argc[]) 
	{ 
		
	        Scanner sc=new Scanner(System.in);
                       System.out.println("n=");
		int n = sc.nextInt(); 
		System.out.println("array elements");
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("Output");
		System.out.println(countZeroso(a, n)); 
	} 
}

output :
n=
5
array elements
23 45 67 89 23
output	
1
