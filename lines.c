#include<stdio.h>
#include<conio.h>
main()
{
char line[81],ctr;
int i,c,end=0,charecters=0,lines=0;
printf("enter the paragraph\n");
while(end==0)
{
c=0;
while((ctr=getchar())!='\n')
line[c++]=ctr;
line[c]=";
if(line[0]==")
break;
lines=lines+1;
}
printf("\n");
printf("Number of lines=%d\n",lines);
}
