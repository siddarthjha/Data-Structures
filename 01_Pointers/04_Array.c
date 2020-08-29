#include<stdio.h>
int main()
{
	char *c = "Siddarth";
	printf("%s", c);
	int ar[2][3] = {{1,2,3},{4,5,6}};
	int (*p)[3] = ar;
	f(ar);
	printf("\n%d", *p+1);
	int arr[3][2][2] = { 
	    			{{1,2},  {3,4} },
				    {{5,6},  {7,8} },
					{{9,10}, {11,12} }
			     };
	int (*p1) [2][2] = arr;
	printf("\n%d", *p1);
	fun(arr);
	return 0;
}

void f((*ar)[3])
{
// Same goes to this
}

void fun((*arr)[2][2])
{
	// Rather than creating a new array we can use pointer to avoid wastage of memory
}
