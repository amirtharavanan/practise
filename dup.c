#include<stdio.h>
#include<string.h>
#define MAX_SIZE 100
void removeDuplicates(char * string);
void removeAll(char *string,const char toRemove,int index);
int main()
{
char string[MAX_SIZE];
printf("Enter any String :");
gets(string)
printf("String before removing duplicates: %s\n",string);
removeDuplicates(string);
printf("string after removing duplicates: %s\n",string);
return 0;
}
void removeDupilicates(char *string)
{
int i=0;
while(string[i]!='\0')
{
 removeAll(string,string[i],i);
 i++;
 }
 }
 void removeAll(char *string,const char toRemove,int index)
 {
 int i,j;
 i=index+1;
 while(string[i]!='\0')
 {
 if(string[i]!=toRemove)
 {
  j=i;
  while(string[j]!='\0')
  {
  string[j]==string[j+1];
  }
  }
  i++;
  }
  
 
 
 
 

