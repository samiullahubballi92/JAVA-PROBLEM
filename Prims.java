import java.util.*;
public class Prims {
	public void solve(int a[][],int so[],int n,int s)
	{
		int k,i,j,min,sum=0,flag=0,u=0,v=0;
		so[s]=1;
		k=1;
		while(k<=n-1)
		{
			min=99;
			for(i=1;i<=n;i++)
				for(j=1;j<=n;j++)
					if(so[i]==1&&so[j]==0)
					if(i!=j&&min>a[i][j])
					{
						min=a[i][j];
						u=i;
						v=j;
					}
			so[v]=1;
			sum=sum+min;
			k++;
			System.out.println(u+"->"+v+"="+min);
		}
		for(i=1;i<=n;i++)
			if(so[i]==0)
				flag=1;
		if(flag==1)
			System.out.println("NO spanning tree");
		else 
			System.out.print("The cost is "+sum);
		
	}
	public static void main(String[] args) {
	int w[][]=new int[10][10];
	int n,i,j,s;
	int sol[]=new int[10];
	System.out.println("enter the number of vertices");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
		sol[i]=0;
	System.out.println("enter the wieghted matrix");
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
			w[i][j]=sc.nextInt();
	System.out.println("Enter the source vertex");
	s=sc.nextInt();
	Prims p=new Prims();
	p.solve(w, sol, n, s);
			
	}

}
