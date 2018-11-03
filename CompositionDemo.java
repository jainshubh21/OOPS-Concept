
public class CompositionDemo 
{
  int CourseId;
  String CourseName;
  
  public CompositionDemo(int CourseId , String CourseName)
  {
	  this.CourseId = CourseId;
	  this.CourseName = CourseName;
  }
  
  public void ShowCourseDetails()
  {
	  System.out.println("Course Id : " + CourseId);
	  System.out.println("Course Name : " + CourseName);
  }
 
}
