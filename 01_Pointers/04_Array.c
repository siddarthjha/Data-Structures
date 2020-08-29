#include<stdio.h>
int main()
{
	char *c = "Siddarth";
	printf("%s", c);
	int ar[2][3] = {{1,2,3},{4,5,6}};
	int (*p)[3] = ar;
	printf("\n%d", *p+1);
	int arr[3][2][2] = { 
	    				{{1,2},  {3,4} },
						{{5,6},  {7,8} },
						{{9,10}, {11,12} }
						};
	int (*p1) [2][2] = arr;
	printf("\n%d", *p1);
	return 0;
}
