package generic_learn.wildcard;

import java.util.Arrays;

public class WildCardTest {
	// 모두 가능
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// Student와 상속 받는 CollegeStudent만 가능
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// Worker와 그 상위인 Person만 가능
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	// CollegeStudent와 그 상위인 Student, Worker(형제 클래스라서 가능), Person 모두 가능
	public static void registerCourseCollegeStudent(Course<? super CollegeStudent> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		// Person이 최상위라서 상속 받는 모두 가능
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("대학생"));

		// Worker는 상속 받는 자식 클래스가 없기에 직장인만 가능
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));

		// Student를 상속 받는 자식 클래스도 있기에 학생, 대학생 가능
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new CollegeStudent("대학생"));

		// CollegeStudent는 상속 받는 자식 클래스가 없기에 대학생만 가능
		Course<CollegeStudent> collegeStudentCourse = new Course<>("대학생 과정", 5);
		collegeStudentCourse.add(new CollegeStudent("대학생"));

		/* 모든 과정 등록 가능 */
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(collegeStudentCourse);

		System.out.println("/* ---------------- ---------------- */");

		/* 학생, 대학생 과정만 등록 가능 */
		// registerCourseStudent(personCourse); // 컴파일 에러
		// registerCourseStudent(workerCourse); // 컴파일 에러
		registerCourseStudent(studentCourse);
		registerCourseStudent(collegeStudentCourse);

		System.out.println("/* ---------------- ---------------- */");

		/* 일반인, 직장인 과정만 등록 가능 */
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse); // 컴파일 에러
		// registerCourseWorker(collegeStudentCourse); // 컴파일 에러

		System.out.println("/* ---------------- ---------------- */");

		/* 직장인 제외 모든 과정 등록 가능 */
		registerCourseCollegeStudent(personCourse);
		// registerCourseCollegeStudent(workerCourse); // 컴파일 에러
		registerCourseCollegeStudent(studentCourse);
		registerCourseCollegeStudent(collegeStudentCourse);
	}
}