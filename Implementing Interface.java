
                                //Implementing Interface
import java.util.*;
interface factorial
{
void process();
}
class fact implements factorial
{
int i,f=1,a;
public void process()
{
Scanner sd=new Scanner(System.in);
System.out.println("Enter any positive integer :");
a=sd.nextInt();
for(int i=1;i<=a;i++)
{
f=f*i;
}
System.out.println("Factorial of  " +a+  " is: " +f);
}
public static void main(String args[])
{
fact f1=new fact();
f1.process();
}}
