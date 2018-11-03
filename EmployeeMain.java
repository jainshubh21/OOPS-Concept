import java.util.*;

public class EmployeeMain 
{
	public static void main(String []args)
	{
       WageEmployee WgEmpObj = new WageEmployee();
       SalariedEmployee SalEmpObj = new SalariedEmployee();
  
        //WgEmpObj.ShowEmployeeDetails();
        WgEmpObj.ShowWageDetails();
        
       // SalEmpObj.ShowEmployeeDetails();
        SalEmpObj.ShowSalaryDetails();
        
  
	}
}
