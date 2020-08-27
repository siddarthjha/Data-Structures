#include<stdio.h>

int main()
{
	int a;
	a = 10;
	int *p;
	p = &a;
	printf("The value of a = %d", a);
	printf("\nThe value of p = %d", p);
	printf("\nThe address of a = %d", &a);
	printf("\nThe value at p is %d", *p); // Derefrencing
	int **p1; // Pointer to pointer
	p1 = &p;
	printf("\nThe value of p1 %d",p1);
	printf("\nThe address of p1 %d",&p1);
	printf("\nThe value of address at *p1 %d", *p1);
	printf("\nThe value of address at **p1 %d", **p1);
	**p1 = 5;
	printf("\nModified value of a from **p1 %d", a);
	
	// Arithmetic Operations with Pointers
	printf("\nThe size of pointer %d",sizeof(p));
	printf("\nThe value of p+1 is %d bytes", p+1);
	printf("\nThe value of *(p+1) is %d", *(p+1));
	printf("\nThe value of **(p+1) is %d", **(p1+1));
	
	return 0;
}
