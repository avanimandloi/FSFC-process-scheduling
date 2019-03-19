#include<bits/stdc++.h>
using namespace std;

int main()
{
  int p, i, j, sum=0, min, index;
  float awt;

 cout<<"\nEnter The Total Number of Process: ";
 cin>>p;
 
 int proc[p];
 int *cbt = new int[p];
 int  *wt = new int[p];
 int *tmp = new int[p];
    
 cout<<"\nEnter CBT of Process:\n";
    
 for(i=0; i<p; i++)
    {   
	 cin>>cbt[i];
     tmp[i]=cbt[i];
    }
 
  sort(cbt, cbt+p);

  for(j=0; j<=p; j++)
  {
    min=100;
    for(i=0; i<p; i++)
    {
      if(min>tmp[i]&&tmp[i]!=-1)
      { 
       min=tmp[i];  
       index=i;
      }
   }
   
    wt[j]=sum;
    sum+=tmp[index];
    tmp[index]=-1;
   
    if(j==p)
     break;
      cout<<'P'<<index+1<<"  |  ";
    proc[j]=index+1;
  } 
     for(i=0; i<p; i++)
    {
     awt=awt+wt[i];
 }
 awt=(awt)/p;
 cout<<"\n\nTotal Waiting Time: "<<awt;

 
 return 0;
}
