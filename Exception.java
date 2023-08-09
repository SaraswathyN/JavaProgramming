
                                     //Exception
import java.lang.*;
import java.util.*;
class myex extends Exception
{
myex(String s)
{
super(s);
}}
class except{
 public static void main(String args[]){
try
{
int age;
Scanner sd=new Scanner(System.in);
System.out.println("Enter your age:");
age=sd.nextInt();
if(age<18)
throw new myex("YOU ARE NOT ELIGIBLE");
else
throw new myex("YOU ARE ELIGIBLE");
}
catch(myex e)
{
System.out.println(" Caught my error\n"+e.getMessage());
}}}
