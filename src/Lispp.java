import java.io.*;
import java.lang.*;
import java.util.*;
class node
{
	int data;
	node next;
	node(int a)
	{
		data=a;
		next=null;
	}
}
class list
{
	node head=null;
	public void insert(int a)
	{
		node p=new node(a);
		if(head==null)
			head=p;
		else
		{
			node t=head;
			while(t.next!=null)
				t=t.next;
			t.next=p;
		}
	}
	public void viewEle()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			System.out.println("List is");
			node t=head;
			while(t!=null)
			{
				System.out.println(t.data+" ");
				t=t.next;
			}
		}
	}
	public void car()
	{
		if(head==null)
			System.out.println("list empty");
		else
			System.out.println(head.data);
	}
	public void cdr()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			node t=head.next;
			System.out.println("the remaining elements are");
			while(t!=null)
			{
				System.out.println(t.data);
				t=t.next;
			}
		}
	}
	public void adjoint(int a)
	{
		int f=0;
		node t=head;
		while(t!=null)
		{
			if(a==t.data)
			{
				f=1;
				break;
			}
			t=t.next;
		}
		if(f==1)
			System.out.println("element exists");
		else
		{
			System.out.println("element doesn't exist, will be inserted at the end");
			insert(a);
		}
	}
}
public class Lispp
{
	public static void main(String[] ag)
	{
		int c;
		Scanner s1=new Scanner(System.in);
		list l=new list();
		do
		{
			System.out.println("1.insert 2.view 3.car 4.cdr 5.adjoin");
			int ch=s1.nextInt();
			switch(ch)
			{
				case 1: System.out.println("enter element");
					int a=s1.nextInt();
					l.insert(a);
					break;
				case 2:l.viewEle();
					break;
				case 3:l.car();
					break;
				case 4:l.cdr();
					break;
				case 5:System.out.println("enter element");
					int s=s1.nextInt();
					l.adjoint(s);
					break;
			}
			System.out.println("press 0 to continue");
			c=s1.nextInt();
		}while(c==0);
	}
}