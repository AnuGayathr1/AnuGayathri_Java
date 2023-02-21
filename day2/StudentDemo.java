package day2;
import java.util.*;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Result r=new Result();
	System.out.println("Enter Name: ");
	String name=sc.next();
	System.out.println("Enter RollNo: ");
	int roll=sc.nextInt();
	System.out.println("Enter the marks of 3 subjects: ");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	System.out.println("Name: "+r.getName(name));
	System.out.println("RollNo: "+r.getrollNo(roll));
	System.out.println(r.totalMark(m1,m2,m3));
	}
}
class Student{
	String name;
	int rollno;
}
class Exam extends Student{
	int marks1;
	int marks2;
	int marks3;
}
class Result extends Exam{
	int total;
	public String getName(String name) {
		return name;
	}
	public int getrollNo(int rollno) {
		return rollno;
	}
	public int totalMark(int marks1,int marks2, int marks3) {
		int total=marks1+marks2+marks3;
		return total;
	}
}