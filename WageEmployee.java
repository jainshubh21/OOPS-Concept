
public class WageEmployee extends Employee 
{
  int wage;
  
  public WageEmployee()
  {
	  EmployeeId = 2109;
	  EmployeeName = "Shubham";
	  wage = 25000;
  }
  
  public void ShowWageDetails()
  {
	  System.out.println("Employee ID :" + EmployeeId);
	   System.out.println("Employee Name :" + EmployeeName);
	   
	  System.out.println("Employee Wage :" + wage);
	  
  }
}
