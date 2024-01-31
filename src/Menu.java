import java.io.File;
import java.io.FileNotFoundException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Menu {
	//made array list mehtods for all classes except driver
	private static ArrayList<Course> mainCourse = new ArrayList<Course>(); 
    private static ArrayList<Student> mainStudent = new ArrayList<Student>();
    private static ArrayList<Faculty> mainFaculty = new ArrayList<Faculty>();
    private static ArrayList<GeneralStaff> maingeneralStaff = new ArrayList<GeneralStaff>();
    
    
    
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//COURSE OBJECTS
		String courseDept = " "; 
		int courseNum;
		boolean isGraduateCourse;
		int numCredits;
		//GENERAL STAFF OBJECTS
		String name = " ";
		int birthYear = 0;
		String deptName = null;
		String duty;
		//FACULTY STAFF OBJECT
		Course[] coursesTaught = new Course[100];
		int numCoursesTaught;
		boolean isTenured = false;
		//STUDENTS OBJECT
		Course[] coursesTaken = new Course[50];
		int studentID;
		int numCoursesTaken;
		String major = " ";
		boolean isGraduate = false;
		//for the user to input the answers
		String userChoice = " ";
		char operation;
		char startOver = 'Y';
		int additionalInputs;

		while (startOver==('Y') || (startOver==('y'))) {
			System.out.println("Would you like to see menu: Yes/No");
			userChoice = scnr.next();
			while (userChoice.equalsIgnoreCase("Yes")) {
				System.out.print("Enter 'a' for: Create 3 new Course objects based on input\r\n" + 
						"Enter 'b' for: Create 3 new Faculty objects based on input\r\n" + 
						"Enter 'c' for: Create 3 new GeneralStaff objects based on input\r\n" + 
						"Enter 'd' for: Create 3 new Student objects based on input\r\n" + 
						"Enter 'e' for: Add 2 new Courses to a Faculty object\r\n" + 
						"Enter 'f' for: Add 2 new Courses to a Student object\r\n" + 
						"Enter 'g' for: Add an array of 2 Courses to a Faculty object\r\n" + 
						"Enter 'h' for: Add an array of 2 Courses to a Student object\r\n" + 
						"Enter 'i' for: Get the Course at index (valid and invalid indexes) from a Faculty object\r\n" + 
						"Enter 'j' for: Get the Course at index (valid and invalid indexes) from a Student object\r\n" + 
						"Enter 'k' for: Allow the user to select a Faculty object and a Course object from menus and query the Faculty object for the Course to determine whether the Faculty object teaches it or not.\r\n" + 
						"Enter 'l' for: Determine which Faculty object teaches the most and the least courses\r\n" + 
						"Enter 'm' for: Determine which Course is the minimum and which is the maximum of all Course objects in the catalog.\r\n" + 
						"Enter 'n' for: Determine which Student has the most and least credits\r\n" + "");

				operation = scnr.next().charAt(0);
				
		switch (operation) {

			case 'a':
				//ask the user to input the format for the object
				System.out.println("Enter a Course Department: ");
				courseDept = scnr.next();
				System.out.println("Enter the three digit Course number: ");
				courseNum = scnr.nextInt();
				System.out.println("Enter the amount of credits: ");
				numCredits = scnr.nextInt();
				System.out.println("Enter true/false if student is a graduate: ");
				isGraduateCourse= scnr.nextBoolean();

				//first object case for course
				System.out.println("COURSE:");
				Course course = new Course (isGraduateCourse,  courseNum,  courseDept, numCredits);
				course.isGraduateCourse();
				System.out.println(course.toString());
				
				//ask the user to input the format for the object
				System.out.println("Enter a Course Department: ");
				courseDept = scnr.next();
				System.out.println("Enter the three digit Course number: ");
				courseNum = scnr.nextInt();
				System.out.println("Enter the amount of credits: ");
				numCredits = scnr.nextInt();
				System.out.println("Enter true/false if student is a graduate: ");
				isGraduateCourse= scnr.nextBoolean();

				//first object case for course
				System.out.println("COURSE:");
				Course course2 = new Course (isGraduateCourse,  courseNum,  courseDept, numCredits);
				course2.isGraduateCourse();
				System.out.println(course2.toString());
				break;
				
				
			case 'b':
				//ask the user to input the format for the object
		    	System.out.println("Enter the person's name: ");
		    	name = scnr.next();
		    	System.out.println("Enter the person's birth year: ");
		    	birthYear= scnr.nextInt();
		    	System.out.println("");//no department name
		    	deptName = scnr.next();
				System.out.println("Enter if the teacher is tenured: ");
				isTenured = scnr.nextBoolean();

				//first object case for faculty
				System.out.println("FACULTY:");
				Faculty faculty = new Faculty (name, birthYear, deptName, isTenured);
				faculty.isTenured();
				System.out.println(faculty.toString());
				
				
				break;
				
			case 'c':
				//ask the user to input the format for the object
				System.out.println("Enter a Person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println(" "); // no input of a department
				deptName = scnr.next();
				System.out.println("Enter the duty that person does: ");
				duty = scnr.next();

				//first object case fofr General Staff
				System.out.println("GENERAL STAFF:");
				GeneralStaff generalStaff = new GeneralStaff (name, birthYear, deptName, duty);
				System.out.println(generalStaff.toString());
				break;
				
			case 'd':
				//ask the user to input the format for the object
		    	System.out.println("");// no input of a name
		    	name = scnr.next();
		    	System.out.println("Enter the student's birth year: ");
		    	birthYear= scnr.nextInt();
		    	System.out.println(""); //double check major
		    	major = scnr.next();
		    	System.out.println("Enter if student is a graduate: ");
		    	isGraduate = scnr.nextBoolean();

		    	//first object case for Student
		    	System.out.println("STUDENTS:");
		    	Student student = new Student(name, birthYear, major, isGraduate);
		    	student.isGraduate();
				System.out.println(student.toString());
				break;
				
			case 'e':
				System.out.println("Enter amount of courses being taught: ");
				numCoursesTaught = scnr.nextInt();
				System.out.println("The amount of courses shall gain an additional 2 courses for faculty");
				int total = numCoursesTaught + 2;
				System.out.println("number of courses taught = " + total);
				break;
				
			case 'f':
				System.out.println("Enter amount of courses being taken: ");
				numCoursesTaken = scnr.nextInt();
				System.out.println("The amount of courses shall gain an additional 2 courses for student");
				int sum = numCoursesTaken + 2;
				System.out.println("number of courses taken = " + sum);
				break;
				
			case 'g':
				//get number of courses taught
				System.out.println("Enter amount of courses being taught: ");
				numCoursesTaught = scnr.nextInt();
				System.out.println("An additional 2 courses shall be added");
				for(int i =0; i< coursesTaught.length; i++) {
					System.out.println(coursesTaught[i + 2] + " ");
				Student student1 = new Student(name, birthYear, major, isGraduate);
				mainStudent.add(student1);
				System.out.println(student1.toString());
				}
				  
				break;
				
			case 'h':
				//get number of courses taken
				System.out.println("Enter amount of courses being taken: ");
				numCoursesTaken = scnr.nextInt();
				System.out.println("An additional 2 courses shall be added");
				for(int i =0; i< coursesTaken.length; i++) {
					System.out.println(coursesTaken[i + 2] + " ");
				Faculty faculty1 = new Faculty (name, birthYear, deptName, isTenured);
				mainFaculty.add(faculty1);
				System.out.println(faculty1.toString());
				}
				
				break;
				
			case 'i':
				//Get the Course at index (valid and invalid indexes) from a Faculty object
				//index the class has
				/* public Course getCourseTaken(int index) {
        		if(index >= 0 && index < numCoursesTaken) {
            	return coursesTaken[index];
        		}
        		return null;
    			}
   
    			public String getCourseTakenAsString(int index) {
        		if(index >= 0 && index < numCoursesTaken) {
            	return coursesTaken[index].toString();
        		}
        		return "";
    			}
	
   				public String getAllCoursesTakenAsString() {
        		String result = "";
        		for(int index = 0; index < numCoursesTaken; index++) {
            	result += coursesTaken[index].toString();
        		}
        		return result;
    			}	
				 */
				
				break;
				
			case 'j':
				//Get the Course at index (valid and invalid indexes) from a Student object
				break;
				
			case 'k':
				//Allow the user to select a Faculty object and a Course object 
				//from menus and query the Faculty object for the Course to determine whether the Faculty 
				//object teaches it or not.\r\n" + 
				System.out.println("which course are you wondering if Faculty teaches it?");
				courseDept = scnr.next();
				if(courseDept.equalsIgnoreCase("mat")){
					System.out.println("The Faculty does teach that course");
				} else if (courseDept.equalsIgnoreCase("cmp")){
					System.out.println("The Faculty does teach that course"); 
				}else {
					System.out.println("The Faculty does NOT teach that course");
				}
				break;
				
			case 'l':
				System.out.println("Enter the amount of classes faculty member 1 teaches: ");
				numCoursesTaught = scnr.nextInt();
				int a1 = numCoursesTaught;
				System.out.println("Enter the amount of classes faculty member 2 teaches: ");
				numCoursesTaught = scnr.nextInt();
				int a2 = numCoursesTaught;
				if(a1>a2) {
					System.out.println("Faculty member 1 teaches more");
				} else {
					System.out.println("Faculty member 2 teaches more");
				}
				break;
				
			case 'm':
				//Determine which Course is the minimum and which is the maximum of all 
				//Course objects in the catalog.
				System.out.println("Enter the length of the Course Object: ");
				int length = scnr.nextInt();
				Course[] coursesTaken1 = new Course[length];
				System.out.println("Enter the elements of the array: ");
				for(int i = 0; i <length;i++) {
				 //coursesTaken1[i]=scnr.nextInt(); 
				}
				System.out.println(Arrays.toString(coursesTaken1));
				
				break;
				
			case 'n':
				System.out.println("Enter the amount of credits student 1 has: ");
				numCredits = scnr.nextInt();
				int b1 = numCredits;
				System.out.println("Enter the amount of credits student 2 has: ");
				numCredits = scnr.nextInt();
				int b2 = numCredits;
				if(b1>b2) {
					System.out.println("Student 1 has more credits");
				} else {
					System.out.println("Student 2 has more credits");
				}
				break;
				
			default: {
				System.out.println("Invalid operation choice from menu entered");
				break;
			}
		}
			System.out.println("Do you want to start over? (Y/N)");
			startOver = scnr.next().charAt(0);
			if ((startOver==('Y')) || (startOver==('y'))) {
				break;
			} else if ((startOver==('N')) || (startOver==('n'))) {
				System.out.println("Goodbye");
			}
			break;
			}
		}
	}
}
