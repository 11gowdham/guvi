#include<stdio.h>
#include<conio.h>
int main()
{
int a,b=0;
printf("Enter a value:");
scanf("%d",&a);
for(int i=0;i<a;i++)
b=b+i;
printf("Value is %d",b);
return 0;
}
