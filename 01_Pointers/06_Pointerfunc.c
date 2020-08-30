#include<stdio.h>
#include<stdlib.h>

int *square(int *x, int *y);
void main()
{
	int x , y, *z;
	printf("Enter two numbers for multiplication\n");
	scanf("%d %d", &x, &y);
	z = square(&x, &y); // If we call any other function here then the value of local variable flushes out 
	printf("value = %d", *z);
	
}

int *square(int *x, int *y)
{
	int *z;
	z = (int*)malloc(sizeof(int));// So instead of a local variable we have allocated it's memory in heap
	*z = (*x )* (*y);
	return z;
}

