package practice14.common;

public class DBCourse implements Course {

	public String getCourseName() {
		return PREFIX + "DB基礎";
	}


	String[] CourseUnit = {"DB基礎,SQL基礎,正規化,SQL応用"};

	public String[] getCourseUnit() {
		return this.CourseUnit;
	}
}
