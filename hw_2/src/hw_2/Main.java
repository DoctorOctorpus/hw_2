package hw_2;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"G�khan D�lger","e-mail","Java");
		Courses courseJava=new Courses(1,"JavaCourse","LearnJava");
		Courses courseCsharp=new Courses(2,"C sharp Course","Learn C sharp");
		Courses courseProggiris=new Courses(3,"Programlamaya Giri�","Programlamaya ba�la");
		
		courseManager CourseManager=new courseManager();
		CourseManager.Join(user);
		
	}

}
