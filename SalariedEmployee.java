
public class SalariedEmployee extends Employee
{
  int salary;
  
  public SalariedEmployee()
  {
	  EmployeeId = 1996;
	  EmployeeName = "Irfan";
	  salary = 40000;
  }
  
  public void ShowSalaryDetails()
  {
	  System.out.println("Employee ID :" + EmployeeId);
	   System.out.println("Employee Name :" + EmployeeName);
	   
	  System.out.println("Employee Salary :" + salary);
  }
}
