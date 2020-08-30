#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *a;
	a = (int*)malloc(sizeof(int));
	// malloc doesn't intitialize with any values
	*a =10;
	printf("%d", a);
	printf("\n%d\n%d", *a, *(a+1));
	int *c;
	c = (int*)calloc(4, sizeof(int));
	// calloc intialize the values with 0 if not given any
	*c = 1;
	printf("\nAddress = %d, c =  %d c+1 = %d", c, *c, *(c+1));
	*(c+1) = 2;
	printf("\nAddress = %d, c =  %d c+1 = %d", c, *c, *(c+1)) ;
	return 0;
}
