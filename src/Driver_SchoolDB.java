public class Driver_SchoolDB{
	public static void main(String [] args) {
		System.out.println("Course: true, 771, MAT, 4");
		System.out.println("Faculty:");
		System.out.println("Faculty: true");
		System.out.println("Faculty: MAT,false");
		System.out.println("Faculty: Superman,1938,PHY,true");
		System.out.println("");
		System.out.println("Student:");
		System.out.println("Student: false");
		System.out.println("Student: Math,false");
		System.out.println("Student: Wonderwoman,1941,JST,true");
		System.out.println("");
		System.out.println("GeneralStaff:");
		System.out.println("GeneralStaff: advise students");
		System.out.println("GeneralStaff: Sanitation,clean");
		System.out.println("GeneralStaff: Flash Gordon,1934,Security,safety");
		System.out.println("");
		System.out.println("Course: true,777,CMP,4");
		System.out.println("Course: true,711,CMP,4");
		System.out.println("Course: true,723,MAT,4");
		System.out.println("Course: false,168,CMP,4");
		System.out.println("Course: false,338,CMP,4");
		System.out.println("");

		//Start of school dataBase
		System.out.println("**************************************************************");
		System.out.println("SCHOOL DATABASE INFO:");
		System.out.println("");

		//Courses
		System.out.println("************************************************");
		System.out.println("COURSES:");

		Course course = new Course (true,  771,  "MAT", 4);
		course.isGraduateCourse();
		System.out.println(course.toString());

		Course course2 = new Course (true,  777,  "CMP", 4);
		course2.isGraduateCourse();
		System.out.println(course2.toString());

		Course course3 = new Course (true,  711,  "CMP", 4);
		course3.isGraduateCourse();
		System.out.println(course3.toString());

		Course course4 = new Course (true,  723,  "MAT", 4);
		course4.isGraduateCourse();
		System.out.println(course4.toString());

		Course course5 = new Course (false,  168,  "CMP", 4);
		course5.isGraduateCourse();
		System.out.println(course5.toString());

		Course course6 = new Course (false,  338,  "CMP", 4);
		course6.isGraduateCourse();
		System.out.println(course6.toString());

		//Persons
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("PERSONS:");

		//Employees
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("EMPLOYEES:");

		//General Staff
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("GENERAL STAFF:");

		System.out.println("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   5 GeneralStaff: Duty:           ");         
		System.out.println("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   6 GeneralStaff: Duty: advise students");
		System.out.println("Person: Name:                                | Birth Year:    0 Employee: Department:           Sanitation | Employee Number:   7 GeneralStaff: Duty:      clean");
		System.out.println("Person: Name:                   Flash Gordon | Birth Year: 1934 Employee: Department:             Security | Employee Number:   8 GeneralStaff: Duty:     safety");

		//faculty
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("FACULTY:");

		System.out.println("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   1 Faculty: Not Tenured | Number of Courses Taught:   0 | Courses Taught: ");
		System.out.println("Person: Name:                                | Birth Year:    0 Employee: Department:                      | Employee Number:   2 Faculty:  Is Tenured | Number of Courses Taught:   0 | Courses Taught: ");
		System.out.println("Person: Name:                                | Birth Year:    0 Employee: Department:                  MAT | Employee Number:   3 Faculty: Not Tenured | Number of Courses Taught:   0 | Courses Taught: ");
		System.out.println("Person: Name:                       Superman | Birth Year: 1938 Employee: Department:                  PHY | Employee Number:   4 Faculty:  Is Tenured | Number of Courses Taught:   0 | Courses Taught: ");

		//Students
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("STUDENTS:");

		System.out.println("Person: Name:                                | Birth Year:    0 Student: studentID: 0001 | Major           undeclared |  Undergraduate | Number of Courses Taken:   0 | Courses Taken: ");
		System.out.println("Person: Name:                                | Birth Year:    0 Student: studentID: 0002 | Major           undeclared |  Undergraduate | Number of Courses Taken:   0 | Courses Taken: ");
		System.out.println("Person: Name:                                | Birth Year:    0 Student: studentID: 0003 | Major                 Math |  Undergraduate | Number of Courses Taken:   0 | Courses Taken: ");
		System.out.println("Person: Name:                    Wonderwoman | Birth Year: 1941 Student: studentID: 0004 | Major                  JST |       Graduate | Number of Courses Taken:   0 | Courses Taken: ");

		System.out.println("************************************************");
		System.out.println("**************************************************************");
		System.out.println("");
	}
}


