import java.io.*;
import java.util.*;
class prob3
{
public static void main(String ar[])
{
	int n,r=1,max,i,j,f=1;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int[] a=new int[n+1];
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(i=0;i<n;i++)
{
		if(a[i]<0 && a[i]>230)
                  f=0;
}
if(f!=0)
{
	max=a[0]^a[1];
        i=1;
        j=i+1;
	while(j<=n)
{
		r=a[i]^a[j];
		if(r>max)
			max=r;
		i++;
		j++;
}
System.out.println(max);
}
}
}
		
		
	
	