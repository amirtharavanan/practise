#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf("Do you want to shutdown the system now(y/n)\n");
scanf("%c",&ch);
if(ch=='y' || ch=='Y')
system("C:\\WINDOWS\\System32\\shutdown-s");
return 0;
}
