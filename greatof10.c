#include<stdio.h>
#include<conio.h>
int main()
{
int a[10]={0,1,2,3,4,5,6,7,8,9};
b=a[0];
for(i=1;i<10;i++)
{
if(a[i]>b)
{
b=a[i];
}
}
printf("%d",b);
return 0;
}
