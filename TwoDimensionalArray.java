
                                     //TwoDimensionalArray
import java.util.*;
class matrix
{
public static void main(String args[])
{
int r1,r2,c1,c2,i,j,k,mul;;
Scanner sd=new Scanner(System.in);
System.out.println("Enter the row and column of the matrix1:");
r1=sd.nextInt();
c1=sd.nextInt();
System.out.println("Enter the row and column of the matrix2:");
r2=sd.nextInt();
c2=sd.nextInt();
if(c1==r2)
{
int mat1[][]=new int[r1][c1];
int mat2[][]=new int[r2][c2];
int res[][]=new int[r1][c2];
System.out.println("Enter the elements of matrix1:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
mat1[i][j]=sd.nextInt();
}
System.out.println("Enter the elements of matrix2:");
for(i=0;i<r2;i++) {
for(j=0;j<c2;j++)
mat2[i][j]=sd.nextInt();
}
System.out.println("Output of the matrix:");
for(i=0;i<r1;i++)
for(j=0;j<c2;j++)
{
mul=0;
for(k=0;k<r2;k++)
{
mul +=mat1[i][k]*mat2[k][j];
}
res[i][j]=mul;
}
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
System.out.print(res[i][j]+"\t ");
System.out.println();
}}
else
{
System.out.println("multiplication does not exists");
}}
}
