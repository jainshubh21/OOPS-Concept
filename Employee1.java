
public class Employee1 
{
	
		int empId;
		String empName;
		
		public Employee1(int eid,String ename)
		{
			empId=eid;
			empName=ename;
		}
		
		public String toString()
		{
			return "Employee Id:"+empId+" Employee Name:"+empName;
		}
		
		public static void main(String arg[])
		{
			Employee1 objEmployee=new Employee1(1001,"Sudhir");
			
			System.out.println(objEmployee);
		}
	
}
