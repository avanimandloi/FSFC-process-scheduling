import java.util.Scanner;        //importing scanner file
class FSFC
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of process");
int n=sc.nextInt();    
int a[]=new int[5];            //declaring array a for arrival time
int e[]=new int[5];            //declaring array e for execution time 
int c[]=new int[5];            //declaring array c for completion time
int t[]=new int[5];            //declaring array t for turnaroundtime 
int w[]=new int[5];            //declaring array w for waiting time
for(int i=1;i<=n;i++)
{
	System.out.println("Enter the deails of process"+i);   //deails of the processes
	System.out.println("Enter the arrival time");
	a[i]=sc.nextInt();
	System.out.println("Enter the execution time");
	e[i]=sc.nextInt();
}
for(int h=1;h<=n;h++)
	System.out.println("Arrival time of process "+h+ " is "+a[h]);

for(int b=1;b<=n;b++)
	System.out.println("Execution time of process "+b+" is "+e[b]);

for(int j=1;j<=n;j++)
{
if(c[j-1]>a[j])                                       //condition for compleion time              
{
c[j]=c[j-1]+e[j];                                    //compleion time = compleion time of previous process + execution time of current process
System.out.println("Compleion time of process "+j+" is "+c[j]);
}
else
{
c[j]=e[j]+a[j];
System.out.println("Compleion time of process "+j+" is "+c[j]);
}}
for(int k=1;k<=n;k++)
{
t[k]=c[k]-a[k];                                    //turn around time = compleion time - arrival time
System.out.println("Turn around time of process "+k+" is "+t[k]);
}
for(int v=1;v<=n;v++)
{
w[v]=t[v]-e[v];                                   //waiting time = turn around time - execution time
System.out.println("Waiting time of process " + v + " is "+ w[v]);
}
}
}
