
                                                          //Multiple Constructor
import java.util.*;
class area
{
Scanner a=new Scanner(System.in);
area()
{
System.out.println("Enter the value of length:");
int l=a.nextInt();
System.out.println("Enter the value of breadth:");
int b=a.nextInt();
int r=l*b;
System.out.println("Area of Rectangle:" +r);
}
area(double side)
{
double r=side*side;
System.out.println("Area of square:" +r);
}
area(float base,float height)
{
float r=(base*height)/2;
System.out.println("Area of triangle:" +r);
}}
public class lab1{
public static void main(String args[]){
area d=new area();
Scanner s=new Scanner(System.in);
System.out.println("Enter value of side :");
float side=s.nextFloat();
area k=new area(side);
System.out.println("Enter value of base:");
float base=s.nextFloat();
System.out.println("Enter value of height:");
float height=s.nextFloat();
area q=new area(base,height);
}}
