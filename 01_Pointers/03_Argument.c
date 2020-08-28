#include<stdio.h>

void fun(int *a);

void main()
{
	int a = 10;
	fun(&a); // Call by refrence
	printf(" a = %d", a);
	int a[5] = {1, 2, 3, 4, 5};
	int size;
	size = sizeof(a)/ sizeof(a[0]);
	size = arr(a, size);
	printf("sum = %d", size);
}

void fun(int *a) // Pointer argument
{
	*a = *a * *a;
}

int arr(int b[], int size)
{
	int sum = 0;
	int i;
	for(i = 0; i < size; i++)
	{
		sum += b[i];
		printf("sum = %d", sum);
	}
	return sum;
}
