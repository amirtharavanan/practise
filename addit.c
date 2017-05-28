#include<stdio.h>
#include<conio.h>
void main()
{
int i,a[5],b[5],sum[5];
clrscr();
printf("\n Reading the 1st array\n");
for(i=0;i<5;i++)
{
printf("Enter the value");
scanf("%d",&a[i]);
}
printf("\n reading the secnd array\n");4
for(i=0;i<5;i++)
{
printf("Enter the value");
scanf("%d",&b[i]);
}
printf("\n the sum is\n");
for(i=0;i<5;i++)
{
sum=a[i]+b[i];
printf("\n the sum is %d & %d is %d",a[i],b[i],sum[i]);
}
getch();
}

