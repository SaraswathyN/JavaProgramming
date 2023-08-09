
                                 //MultiThreading
import java.util.*;
class first extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("First thread" +i);
if(i==7)
stop();
}}}
class second extends Thread
{
public void run()
{
for(int j=0;j<10;j++)
{
System.out.println("second thread" +j);
}}}
class third extends Thread
{
public void run()
{
for(int k=0;k<10;k++)
{
System.out.println("third thread" +k);
}}}
class threads
{
public static void main(String args[])
{
first f1=new first();
second s1=new second();
third t1=new third();
f1.start();
s1.start();
t1.start();
}}
