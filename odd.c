#include<stdio.h>
#include<conio.h>
void main()
{
int sum;
for(int i=1;i<15;i++)
{
sum+=i;
}
printf("%d",sum);
for(int i=15;i<=45;i++)
{
if(i%2!==0)
{
int odd=0;
odd=odd+i;
printf("Sum of odd numbers=%d",odd);
getch();
}
}
}
