                                         //Multilevel Inheritance
import java.util.*;
class grandparent
{
String grandpa,grandma;
int age;
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter grandfather name:");
grandpa=sc.next();
System.out.println("Enter grandmother name:");
grandma=sc.next();
System.out.println("Enter grandfather's age:");
age=sc.nextInt();
System.out.println("Enter grandmother's  age:");
age=sc.nextInt();
}}
class parent extends grandparent
{ 
String fname,mname;
void get1()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter father name:");
fname=sc.next();
System.out.println("Enter mother name:");
mname=sc.next();
}}
class child extends parent
{
String cname;
float weight;
void get2()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter child name:");
cname=sc.next();
System.out.println("Enter weight:");
weight=sc.nextFloat();
}
void display()
{
System.out.println("GRANDFATHER NAME:" +grandpa);
System.out.println("GRANDMOTHER NAME:" +grandma);
System.out.println("GRANDFATHER AGE:" +age);
System.out.println("GRANDMOTHER AGE:" +age);
System.out.println("FATHER NAME:" +fname);
System.out.println("MOTHER NAME:" +mname);
System.out.println("CHILD NAME:" +cname);
System.out.println("WEIGHT:" +weight);
}}
class multilevel{
public static void main(String args[]){
child cd=new child();
cd.get();
cd.get1();
cd.get2();
System.out.println("\t FAMILY DETAILS");
cd.display();
}}
