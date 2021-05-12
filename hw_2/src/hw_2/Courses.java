package hw_2;

public class Courses {
	public Courses(int courseId,String courseName,String courseInfo) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseInfo = courseInfo;
	}
	private int courseId;
	private String courseName;
	private String courseInfo;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseInfo() {
		return courseInfo;
	}
	public void setCourseInfo(String courseInfo) {
		this.courseInfo = courseInfo;
	}
}
