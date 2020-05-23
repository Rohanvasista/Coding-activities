Problem statement :

c program to generate first n Triangular numbers

solution :

include <stdio.h>
void triangular_series(int n)
{

for (int i = 1; i <= n; i++)  

    printf(" %d ", i*(i+1)/2); 
}

int main()
{

int n ;
printf("Enter value for n\n");

scanf("%d",&n);

triangular_series(n); 

return 0;
}

output :

Enter value of n
1 3 6 10 15 21 28 36 45 55
