
                                           //Hierarchical Inheritance
import java.util.*;
class person{
String name;
int age;
void get()
{
Scanner sd=new Scanner(System.in);
System.out.println(" Enter name of the person:");
name=sd.next();
System.out.println(" Enter age of the person:");
age=sd.nextInt();
}
void display()
{
System.out.println("NAME OF THE PERSON:"+name);
System.out.println("AGE OF THE PERSON:"+age);
}}
class youtuber extends person
{
float subscribers;
String ch_name;
String co_type;
void get1()
{
Scanner sd=new Scanner(System.in);
System.out.println(" Enter the youtube channel name:");
ch_name=sd.next();
System.out.println(" Enter subscribers:");
subscribers=sd.nextFloat();
System.out.println(" Enter concept of the video:");
co_type=sd.next();
}
void display1()
{
System.out.println("SUBSCRIBERS:"+subscribers);
System.out.println("CHANNEL NAME:"+ch_name);
System.out.println("CONCEPT:"+co_type);
}}
class scientist extends person
{
String s_name;
String research;
String field;
void get2()
{
Scanner sd=new Scanner(System.in);
System.out.println(" Enter scientist name:");
s_name=sd.next();
System.out.println(" Enter research name:");
research=sd.next();
System.out.println(" Enter the research field:");
field=sd.next();
}
void display2()
{
System.out.println("SCIENTIST NAME:"+s_name);
System.out.println("RESEARCH NAME:"+research);
System.out.println("FIELD NAME:"+field);
}}
class doctor extends person
{
String hosp;
String specialist;
int fee;
void get3()
{
Scanner sd=new Scanner(System.in);
System.out.println(" Enter hospital name:");
hosp=sd.next();
System.out.println(" Doctor hnown for:");
specialist=sd.next();
System.out.println(" Enter consulting fee:");
fee=sd.nextInt();
}
void show()
{
System.out.println("\t HIERARCHICAL INHERITANCE");
}
void display3()
{
System.out.println("HOSPITAL NAME:"+hosp);
System.out.println("KNOWN FOR:"+specialist);
System.out.println("CONSULTING FEE:"+fee);
}}
class inherit{
public static void main(String args[]){
youtuber y1=new youtuber();
y1.get();
y1.get1();
scientist s1=new scientist();
s1.get2();
doctor d1=new doctor();
d1.get3();
d1.show();
y1.display();
y1.display1();
s1.display2();
d1.display3();
}}
