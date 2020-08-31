#include<stdio.h>
#include<stdlib.h>
struct abc
{
	int data;
	struct abc *next;
};

int main()
{
	struct abc *head;
	Printf("Enter the choice\n1.Insert the value\n2.Print the value");
	int i, value;
	scanf("%d", &i);
	printf("\nEnter value");
	scanf("%d", &value);
	if(i == 1)
		insert(value);
	if(i ==2)
		print();
	
	return 0;
}

void insert(int value)
{
	struct abc *ptr;
	ptr = (struct abc*)malloc(sizeof(struct abc));
	ptr.data = value;
}

void print()
{
	
}
