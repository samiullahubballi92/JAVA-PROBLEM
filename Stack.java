package stack;
import java.util.*;
public class Stack {
	static int MX=5;
	int s[]=new int[MX];
	int top=-1;
	void push(int ele)
	{
		if(top>=MX-1)
		{
			System.out.println("Stack overflow");
			
		}
		else
		{
			s[++top]=ele;
		}
	}
	int pop()
	{	int a;
		if(top==-1)
		{
			System.out.println("stack underflow");
			return -1;
		}
		else
		{
			a=s[top];
			top=top-1;
			return a;
		}
	}
	void dis()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i=top;i>-1;i--)
			{
				System.out.println(s[i]+"\n");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack m=new Stack();
		Scanner sc=new Scanner(System.in);
		int ch,q=1;
		while(q!=0)
		{
			System.out.println("1:push 2:pop 3:display 4:exit"+"\n"+"enter the choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("enter the element");
					int ele=sc.nextInt();
					m.push(ele);
					break;
			case 2: int o=m.pop();
					if(o!=-1)
					{
						System.out.println("the deleted element is "+o);
					}
					break;
			case 3: m.dis();
					break;
			case 4: q=0;
					break;
				}
			}
		
	}

}
