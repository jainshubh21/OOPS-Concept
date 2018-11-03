
public class CompositionDemo1 
{
   int StudentId;
   String StudentName;
   
   CompositionDemo CDobj;
   
   public CompositionDemo1(int StudentId , String StudentName , int CourseId , String CourseName)    
   {
	   this.StudentId = StudentId;
	   this.StudentName = StudentName;
	   
	    CDobj = new CompositionDemo(CourseId , CourseName);
   }
   
   public void ShowStudentDetail()
   {
	   System.out.println("Student Id :" + StudentId);
	   System.out.println("Student Name :" + StudentName);
	   CDobj.ShowCourseDetails();
   }
	
}
