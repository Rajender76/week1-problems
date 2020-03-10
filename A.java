import java.io.*;
import java.util.*;
class A
{
   public static void main(String ar[])
{
   Scanner sc=new Scanner(System.in);
   int i,k=0,n;
   System.out.println("enter the number of elements");
   n=sc.nextInt();
   int[] arr=new int[n];
   for(i=0;i<n;i++)
    arr[i]=sc.nextInt();
   int[] ans=new int[n];
   int queries;
   System.out.println("Enter the no of queries:");
   queries=sc.nextInt();
   while(queries!=0)
{
	int x,y,r=1,j;
	x=sc.nextInt();
	y=sc.nextInt();
	i=x;
	j=i+1;
if(x!=y)
{
	r=arr[i]^arr[j];
	while(j<y)
{
	r=r^arr[j+1];
	j++;
}
}
else
{
 r=arr[x]^arr[x];
}
ans[k]=r;
k++;
queries--;
}
for(i=0;i<k;i=i+1)
{
System.out.print(ans[i]+"  ");
}
}
}
	
   
   