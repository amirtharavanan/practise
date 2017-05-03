#include<stdio.h>
#include<conio.h>
#include<windows.h>
int main()
{
int j=0;
printf("Enter Q to quit!\n");
do
{
j++;
printf("%d\n",j);
Sleep(1000);
}
while(kbhit()==0 || getch()!='Q');
return 0;
}
