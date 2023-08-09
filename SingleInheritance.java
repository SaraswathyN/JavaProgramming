                                        // SingleInheritance
import java.util.*;
class employee
{
String name;
int id;
void get()
{
Scanner sd=new Scanner(System.in);
System.out.println("Enter the employee name:");
name=sd.next();
System.out.println("Enter the employee id:");
id=sd.nextInt();
}
void print()
{
System.out.println("EMPLOYEE NAME:" +name);
System.out.println("EMPLOYEE ID:" +id);
}}
class company extends employee
{
String cname;
int salary;
void get1()
{
Scanner sd=new Scanner(System.in);
System.out.println("Enter the company name:");
cname=sd.next();
System.out.println("Enter the salary:");
salary=sd.nextInt();
}
void print1()
{
System.out.println("COMPANY NAME:" +cname);
System.out.println("SALARY:" +salary);
}}
class single
{
public static void main(String args[])
{
company c1=new company();
c1.get();
c1.get1();
c1.print();
c1.print1();
}}
