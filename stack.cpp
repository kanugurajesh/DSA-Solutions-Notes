#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

int st[30],n,top=-1,i,x;

bool isFull()
{
    if(top==n-1)
        return true;
    else
        return false;
}

bool isEmpty()
{
    if(top==-1)
        return true;
    else
        return false;
}

void push(int x)
{
    if(isFull())
        printf("Stack is full\n");
    else
    {
        top++;
        st[top]=x;
    }
}

void pop()
{
    if(isEmpty())
        printf("Stack is empty\n");
    else
    {
        printf("Deleted element is %d\n",st[top]);
        top--;
    }
}

void display()
{
    if(isEmpty())
        printf("Stack is empty\n");
    else
    {
        printf("Stack elements are:\n");
        for(i=top;i>=0;i--)
            printf("%d\n",st[i]);
    }
}

int peek() {
    if(isEmpty())
        printf("Stack is empty\n");
    else
        return st[top];
}

void main() {
    int ch;
    printf("Enter the size of stack\n");
    scanf("%d",&n);
    while(1) {
        printf("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Exit\n");
        printf("Enter your choice\n");
        scanf("%d",&ch);
        switch(ch) {
            case 1: printf("Enter the element to be inserted\n");
                    scanf("%d",&x);
                    push(x);
                    break;
            case 2: pop();
                    break;
            case 3: display();
                    break;
            case 4: printf("Top element is %d\n",peek());
                    break;
            case 5: exit(0);
            default: printf("Invalid choice\n");
        }
    }
}
