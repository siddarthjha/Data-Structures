#include<stdio.h>

void main()
{
	int x = 1032;
	int *p;
	p = &x;
	char *c;
	c = (char*)p;
	// Char pointer has 1 bytes size and int has 4 bytes size so the value may be defered
	printf("*p = %d, *c = %d",*p, *c);
	void *v;
	v = p;
	printf(" v = %d", v); // But we cannot derefrence void pointer like other data type pointers
	
}
