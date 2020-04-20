import java.util.*;
abstract class SalaryAccount
	{
	Scanner sc= new Scanner(System.in);	
	abstract void bank_name();
	public void status_Employee()
	{
		
	}
	}
class PermEmployee extends SalaryAccount
{Scanner sc= new Scanner(System.in);
	public void status_Employee()
	{
	System.out.println("employee permanent");
	}
	PermEmployee()
	{
		System.out.println("constructor 1");
		System.out.println("the name of the bank is indian bank");
		System.out.println("the id of the 1711007");
		System.out.println("the salary is $423");
	}
	PermEmployee(String name,int id)
	{
		System.out.println("constructor 2");
		System.out.println("the name of the employee is "+name);
		System.out.println("the id of the employee is "+id);
		System.out.println("the salary of the employee is $123");
	}
	PermEmployee(String name,int id,int salary)
	{
		System.out.println("contructor 3");
		System.out.println("the name of the employee is "+name);
		System.out.println("the id of the employee is "+id);
		System.out.println("the salary of the employee is "+salary);
	}
	void bank_name()
	{
		System.out.println("enter bank name(permanent)");
		String bname=sc.nextLine();
		System.out.println(bname);
	}
}
class TempEmployee extends SalaryAccount
{Scanner sc= new Scanner(System.in);
	TempEmployee(String name,int id,int salary)
	{
		System.out.println("temp employee constructor");
		System.out.println("the name of the employee is "+name);
		System.out.println("the id of the employee is "+id);
		System.out.println("the slary of the employee is "+salary);
	}
	public void status_Employee()
	{
		System.out.println("temp employee");
	}
	void bank_name()
	{
		System.out.println("enter bank name(temporary)");
		String bname=sc.nextLine();
		System.out.println(bname);
	}
}
class Test
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the employee");
		String name=sc.nextLine();
		System.out.println("enter the employee id");
		int id=sc.nextInt();
		System.out.println("enter the employee salary");
		int salary=sc.nextInt();
		SalaryAccount temp1=new TempEmployee(name,id,salary);
		temp1.bank_name();
		temp1.status_Employee();
		PermEmployee per1=new PermEmployee();
		per1.bank_name();
		PermEmployee per3=new PermEmployee(name,id,salary);
		PermEmployee per2=new PermEmployee(name,id);
		per3.status_Employee();
	}
}