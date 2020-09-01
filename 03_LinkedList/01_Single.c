#include<stdio.h>
#include<stdlib.h>

void insert(int value);
void print();
void delete(int del);
struct abc
{
	int data;
	struct abc *next;
};
struct abc *head = NULL;
int main()
{
	while(1)
	{
		printf("\nEnter the choice\n 1. Insert the value\n 2. Print the value\n 3. Delete value\n 4. EXIT \n");
		int i, value, del;
		scanf("%d", &i);
		if(i == 1)
		{
			printf("\nEnter value ");
			scanf("%d", &value);
			insert(value);
		}	
		if(i ==2)
			print();
		if(i ==3)
		{
			printf("\nEnter value to delete ");
			scanf("%d", &del);
			delete(del);
		}
		if(i == 4)
		{
			printf("Gaand Marao bsdke");
			break;
		}
	}
	
	return 0;
}

void insert(int value)
{
	struct abc *ptr;
	ptr = (struct abc*)malloc(sizeof(struct abc));
	ptr->data = value;
	ptr->next = head;
	head = ptr;
}

void print()
{
	struct abc *ptr = head;
	printf("\n{ ");
	if(ptr==NULL)
		printf("Beta kuch daalo toh sahi");
	while(ptr!=NULL)
	{
		printf("%d ",ptr->data);
		ptr = ptr->next;
	}
	printf(" }");
}

void delete(int del)
{
	
}
