import java.lang.*;
import java.io.*;
class basicNumberStarPattern
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,a=1;
System.out.print("Enter the number of Lines:");
n=Integer.parseInt(br.readLine()); /* Taking Input*/
for(i=1;i<=n;i++)
{
for(j=1;j<n;j++)
{
System.out.print((a++)+"*");
}
System.out.println(a++);
}
}
}