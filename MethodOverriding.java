                                     //MethodOverriding
import java.util.*;
class number
{
int first,second,temp;
void swapping()
{
Scanner sd=new Scanner(System.in);
System.out.println("Before swapping");
System.out.println("Enter the first number:");
first=sd.nextInt();
System.out.println("Enter the second number:");
second=sd.nextInt();
temp=first;
first=second;
second=temp;
}}
class swaps extends number
{
void swapping()
{
super.swapping();
System.out.println("After swapping");
System.out.println("Enter the first number:" +first);
System.out.println("Enter the second number:" +second);
}}
class ride
{
public static void main(String args[])
{
swaps s1=new swaps();
s1.swapping();
}}
