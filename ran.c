#include<stdio.h>
int getnum();
int main()
{
int input=0;
input=getnum();
while(!((input<=9)&&(input>=1)))
{
printf("your entered number is not in range");
input=getnum();
printf("The number you entered is %d",input);
return 0;
}
int getnum()
{
int number;
scanf("%d",&number);
return(number);
}
