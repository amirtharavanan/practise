public class came
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter a sentence: ");
String input=scan.nextline();
String result="";
char firstchar=input.charAt(0);
result=result+Charecter.toUpperCase(firstChar);
for(int i=1;i<=input.length();i++)
{
 char currentChar =input.charAt(i);
 char previousChar=input.charAt(i-1);
 if(previousChar==' ')
 {
 result=result+ Charecter.toUpperCase(currentChar);
 }
 else
 {
 result=result+currentChar;
 }
 System.out.println(result);
}
}

