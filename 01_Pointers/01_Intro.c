#include<stdio.h>

int main()
{
	int a;
	a = 10;
	int *p;
	p = &a;
	printf("The value of a = %d", a);
	printf("The value of p = %d", p);
	printf("The address of a = %d", &a);
	printf("The value at p is %d", *p); // Derefrencing
	int **p1; // Pointer to pointer
	p1 = &p;
	printf("The value of p1 %d",p1);
	printf("The address of p1 %d",&p1);
	printf("The value of address at *p1 %d", *p1);
	printf("The value of address at **p1 %d", **p1);

	return 0;
}
