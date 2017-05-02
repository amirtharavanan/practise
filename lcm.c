#include<stdio.h>
int main()
{
int n1,n2,minmul;
printf("Enter two positive integers");
scanf("%d%d",&n1,&n2);
minmul=(n1>n2)?n1:n2;
while(1)
{
if(minmul%n1==0 && minmul%n2==0)
{
printf("the LCM of %d and %d is %d",n1,n2nminmul);
break;
}
++minmul;
}
return 0;
}
