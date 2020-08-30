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
	c = (int*)calloc(2, sizeof(int));
	// calloc intialize the values with 0 if not given any
	*c = 1;
	printf("\nAddress = %d, c =  %d c+1 = %d", c, *c, *(c+1));
	*(c+1) = 2;
	printf("\nAddress = %d, c =  %d c+1 = %d", c, *c, *(c+1));
	*(c+5) = 3;
	printf("\nAddress = %d, c =  %d c+1 = %d, c+2 = %d\n", c, *c, *(c+1),*(c+10));
	// Frees the memory allocated to c
	free(c);
	// Realloc to defer the allocation size
	a = (int*)realloc(a, 5*sizeof(int));
	int i;
	for(i = 0; i<4;i++)
	{
		scanf("\n%d", &a[i]);
		
	}
	for(i = 0; i<4;i++)
	printf("\n%d", a[i]);
	free(a);
	return 0;
}
