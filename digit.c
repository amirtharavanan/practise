#include<stdio.h>
#define  MAX_SIZE 100
int main()
{
char string[MAX_SIZE];
int digits,i;
digits=i=0;
printf("Enter any string:");
gets(string);
while(strng[i]!='\0')
{
   if(string[i]>='0' && string[i]<='9')
{
digit++;
}
i++;
}
printf("Digits=%d\n",digits);
return 0;
}

