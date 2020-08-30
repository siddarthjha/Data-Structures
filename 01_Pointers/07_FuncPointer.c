#include<stdio.h>
#include<stdlib.h>

int square(int x, int y);
void main()
{
	int x , y, (*z)(int, int);
	printf("Enter two numbers for multiplication\n");
	scanf("%d %d", &x, &y);
	z = square;
	int v;
	v = (*z)(x, y); // z(x,y);
	printf("value = %d", v);
	
	
}

int square(int x, int y)
{
	return x*y;
}

