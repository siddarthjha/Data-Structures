#include<stdio.h>

void fun(int *a);

void main()
{
	int a = 10;
	fun(&a); // Call by refrence
	printf(" a = %d", a);
}

void fun(int *a) // Pointer argument
{
	*a = *a * *a;
}
