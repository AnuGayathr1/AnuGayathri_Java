package day3;
import java.util.Scanner;
interface Stack
{
	public void push(int a);
	public void pop();
}
class FixedStack implements Stack
{
	int top=-1;
	int capacity=8;
	int stack[]=new int[capacity];
	boolean isEmpty()
	{
		if(top<=-1)
		{
			return true;
		}
		else
			return false;
	}
	boolean isFull()
	{
		if(top>=capacity-1)
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}
	public void push(int a)
	{
		if(!isFull())
		{
			top++;
			stack[top]=a;
		}
		else
		{
			System.out.println("Stack full");
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack empty");
		}
		else
		{
			stack[top]=0;
			--top;
		}
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(stack[i]);
		}
	}
}
class DynamicStack implements Stack
{
	int top=-1;
	int capacity=8;
	int stack[]=new int[capacity];
	boolean isEmpty()
	{
		if(top<=-1)
		{
			return true;
		}
		else
			return false;
	}
	boolean isFull()
	{
		if(top>=capacity-1)
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}
	public void push(int a)
	{
		if(isFull())
		{
			increaseStackCapacity();
		}
		else
		{
			top++;
			stack[top]=a;
		}
		
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack empty");
		}
		else
		{
			stack[top]=0;
			--top;
		}
	}
	public void increaseStackCapacity()
	{
		
		int newStack[]=new int[this.capacity*2];
		for(int i=0;i<capacity;i++)
		{
			newStack[i]=this.stack[i];
		}
		this.stack=newStack;
		this.capacity=this.capacity*2;
		
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(stack[i]);
		}
	}
}
public class StackDemo {
	public static void main(String[] args) {
		FixedStack fs=new FixedStack();
		DynamicStack ds = new DynamicStack();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice:");
		System.out.println("1.Fixed Stack");
		System.out.println("2.Dynamic Stack");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			fs.push(10);
			fs.push(67);
			fs.pop();
			fs.push(89);
			fs.push(89);
			fs.push(89);
			fs.push(89);
			fs.push(89);
			
			
			
			fs.display();	
			break;
		case 2:
			ds.pop();
			ds.push(12);
			ds.push(23);
			ds.push(44);
			ds.push(32);
			ds.push(42);
			ds.push(34);
			ds.push(12);
			ds.push(23);
			ds.push(44);
			ds.push(32);
			ds.push(42);
			ds.push(34);
			ds.push(12);
			ds.push(23);
			ds.push(44);
			ds.push(32);
			ds.push(42);
			ds.push(34);
			ds.push(12);
			ds.push(23);
			ds.push(44);
			ds.push(32);
			ds.push(42);
			ds.push(34);
			
			ds.display();
			
		}
	}
}
