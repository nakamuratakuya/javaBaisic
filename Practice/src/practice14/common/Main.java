package practice14.common;

public class Main {
	public static void main(String args) {
		JavaCourse javacourse = new JavaCourse();
		String[] CourseUnit = javacourse.getCourseUnit();
		for (String s : CourseUnit) {
			System.out.println(s);
		}
	}
}
