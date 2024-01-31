//This is Janissa Abreu presenting CMP168 project one menu class
//As you can see from the start I only imported the scanner class 
import java.util.Scanner;
//Janissa Abreu's menu code for project 1 :)
public class Menu2 {

	public static void main(String[] args) {
		// where I created an object for it as soon as the code begins in the main string
		Scanner scnr = new Scanner(System.in);
// Beneath the scanner object I have re-written all instance variables from the previous classes we were meant to create. I have labeled above each set of variables to distinguish which classes they're coming from
		
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
		int numCoursesTaught = 0;
		boolean isTenured = false;
		//STUDENTS OBJECT
		Course[] coursesTaken = new Course[50];
		int studentID;
		int numCoursesTaken;
		String major = " ";
		boolean isGraduate = false;
//or if I created my own variables to assist me in making my code run smoothly
		
		//for the user to input the answers
		String userChoice = " ";
		char startOver = 'Y';
		int additionalInputs;
		
//I used a nested while loop to run this code although it wasn’t a necessity I created this to allow the user to have an option of starting My program over. This is the reason I created the start over char character
		while (startOver==('Y') || (startOver==('y'))) {
//Now starting with the actual code which will continuously ask if you’d like to start the menu you should respond with yes 
			System.out.println("Would you like to enter objects in the menu: Yes/No");
			userChoice = scnr.next();
			while (userChoice.equalsIgnoreCase("Yes")) {
//which leads the system to out print these lines which tell the user what they’ll be doing which is creating three objects for each class asked for in the instructions
				System.out.print("Create 3 new Course objects based on input\r\n" + 
						"Create 3 new Faculty objects based on input\r\n" + 
						"Create 3 new GeneralStaff objects based on input\r\n" + 
						"Create 3 new Student objects based on input\r\n" );
				
//Directly below this you can see that we ask the user for each input that’ll be placed in the object’s to string method and using the scanner we scanned the input the user makes
				//ask the user for the first inputs for course one
				System.out.println("");
				System.out.println("Enter the objects for the first course");
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
				Course course1 = new Course (isGraduateCourse,  courseNum,  courseDept, numCredits);
				course1.isGraduateCourse();
				System.out.println(course1.toString());
				
//Now this is used through lines 44 to 300 but I separate the objects in which classes they pertain to 
				//ask the user for the first inputs for course two
				System.out.println("");
				System.out.println("Enter the objects for the second course");
				//ask the user to input the format for the object
				System.out.println("Enter a Course Department: ");
				courseDept = scnr.next();
				System.out.println("Enter the three digit Course number: ");
				courseNum = scnr.nextInt();
				System.out.println("Enter the amount of credits: ");
				numCredits = scnr.nextInt();
				System.out.println("Enter true/false if student is a graduate: ");
				isGraduateCourse= scnr.nextBoolean();
				//second object case for course
				System.out.println("COURSE:");
				Course course2 = new Course (isGraduateCourse,  courseNum,  courseDept, numCredits);
				course2.isGraduateCourse();
				System.out.println(course2.toString());


				//ask the user for the first inputs for course three
				System.out.println("");
				System.out.println("Enter the objects for the third course");
				//ask the user to input the format for the object
				System.out.println("Enter a Course Department: ");
				courseDept = scnr.next();
				System.out.println("Enter the three digit Course number: ");
				courseNum = scnr.nextInt();
				System.out.println("Enter the amount of credits: ");
				numCredits = scnr.nextInt();
				System.out.println("Enter true/false if student is a graduate: ");
				isGraduateCourse= scnr.nextBoolean();
				//second object case for course
				System.out.println("COURSE:");
				Course course3 = new Course (isGraduateCourse,  courseNum,  courseDept, numCredits);
				course3.isGraduateCourse();
				System.out.println(course3.toString());
				
// simply by out printing a line Of stars as well as out printing all the objects created beforehand so the user may see the courses they’ve created clearly I repeat this for the: faculty etc.
				System.out.println("*********************************");				
				System.out.println("*********************************");				
				System.out.println("All courses created: ");
				System.out.println(course1.toString());
				System.out.println(course2.toString());
				System.out.println(course3.toString());
				System.out.println("*********************************");
				System.out.println("*********************************");



				//ask the user for the first inputs for faculty one
				System.out.println("");
				System.out.println("Enter the objects for the first faculty");
				//ask the user to input the format for the object
				System.out.println("Enter the person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter the department they teach: ");//no department name
				deptName = scnr.next();
				System.out.println("Enter if the teacher is tenured: ");
				isTenured = scnr.nextBoolean();

				//first object case for faculty
				System.out.println("FACULTY:");
				Faculty faculty1 = new Faculty (name, birthYear, deptName, isTenured);
				faculty1.isTenured();
				System.out.println(faculty1.toString());

				//ask the user for the first inputs for faculty two
				System.out.println("");
				System.out.println("Enter the objects for the second faculty");
				//ask the user to input the format for the object
				System.out.println("Enter the person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter the department they teach: ");//no department name
				deptName = scnr.next();
				System.out.println("Enter if the teacher is tenured: ");
				isTenured = scnr.nextBoolean();

				//first object case for faculty
				System.out.println("FACULTY:");
				Faculty faculty2 = new Faculty (name, birthYear, deptName, isTenured);
				faculty2.isTenured();
				System.out.println(faculty2.toString());

				//ask the user for the first inputs for faculty three
				System.out.println("");
				System.out.println("Enter the objects for the third faculty");
				//ask the user to input the format for the object
				System.out.println("Enter the person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter the department they teach: ");//no department name
				deptName = scnr.next();
				System.out.println("Enter if the teacher is tenured: ");
				isTenured = scnr.nextBoolean();

				//first object case for faculty
				System.out.println("FACULTY:");
				Faculty faculty3 = new Faculty (name, birthYear, deptName, isTenured);
				faculty3.isTenured();
				System.out.println(faculty3.toString());

				System.out.println("*********************************");				
				System.out.println("*********************************");				
				System.out.println("All faculties created: ");
				System.out.println(faculty1.toString());
				System.out.println(faculty2.toString());
				System.out.println(faculty3.toString());
				System.out.println("*********************************");
				System.out.println("*********************************");
				
				
				
				//ask the user for the first inputs for general staff one
				System.out.println("");
				System.out.println("Enter the objects for the first general staff");
				//ask the user to input the format for the object
				System.out.println("Enter a Person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter the department they work in: "); // no input of a department
				deptName = scnr.next();
				System.out.println("Enter the duty that person does: ");
				duty = scnr.next();

				//first object case fofr General Staff
				System.out.println("GENERAL STAFF:");
				GeneralStaff generalStaff1 = new GeneralStaff (name, birthYear, deptName, duty);
				System.out.println(generalStaff1.toString());

				//ask the user for the first inputs for general staff two
				System.out.println("");
				System.out.println("Enter the objects for the second general staff");
				//ask the user to input the format for the object
				System.out.println("Enter a Person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter the department they work in: "); // no input of a department
				deptName = scnr.next();
				System.out.println("Enter the duty that person does: ");
				duty = scnr.next();

				//first object case fofr General Staff
				System.out.println("GENERAL STAFF:");
				GeneralStaff generalStaff2 = new GeneralStaff (name, birthYear, deptName, duty);
				System.out.println(generalStaff2.toString());

				//ask the user for the first inputs for general staff third
				System.out.println("");
				System.out.println("Enter the objects for the third general staff");
				//ask the user to input the format for the object
				System.out.println("Enter a Person's name: ");
				name = scnr.next();
				System.out.println("Enter the person's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter the department they work in: "); // no input of a department
				deptName = scnr.next();
				System.out.println("Enter the duty that person does: ");
				duty = scnr.next();

				//first object case fofr General Staff
				System.out.println("GENERAL STAFF:");
				GeneralStaff generalStaff3 = new GeneralStaff (name, birthYear, deptName, duty);
				System.out.println(generalStaff3.toString());


				System.out.println("*********************************");				
				System.out.println("*********************************");				
				System.out.println("All general staffs created: ");
				System.out.println(generalStaff1.toString());
				System.out.println(generalStaff2.toString());
				System.out.println(generalStaff3.toString());
				System.out.println("*********************************");
				System.out.println("*********************************");


				//ask the user for the first inputs for student one
				System.out.println("");
				System.out.println("Enter the objects for the first student");
				//ask the user to input the format for the object
				System.out.println("Enter the person's name: ");		    	
				name = scnr.next();
				System.out.println("Enter the student's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter a major: "); //double check major
				major = scnr.next();
				System.out.println("Enter if student is a graduate: ");
				isGraduate = scnr.nextBoolean();

				//first object case for Student
				System.out.println("STUDENTS:");
				Student student1 = new Student(name, birthYear, major, isGraduate);
				student1.isGraduate();
				System.out.println(student1.toString());

				//ask the user for the first inputs for student two
				System.out.println("");
				System.out.println("Enter the objects for the second student");
				//ask the user to input the format for the object
				System.out.println("Enter the person's name: ");		    	
				name = scnr.next();
				System.out.println("Enter the student's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter a major: "); //double check major
				major = scnr.next();
				System.out.println("Enter if student is a graduate: ");
				isGraduate = scnr.nextBoolean();

				//first object case for Student
				System.out.println("STUDENTS:");
				Student student2 = new Student(name, birthYear, major, isGraduate);
				student2.isGraduate();
				System.out.println(student2.toString());

				//ask the user for the first inputs for student third
				System.out.println("");
				System.out.println("Enter the objects for the third student");
				//ask the user to input the format for the object
				System.out.println("Enter the person's name: ");		    	
				name = scnr.next();
				System.out.println("Enter the student's birth year: ");
				birthYear= scnr.nextInt();
				System.out.println("Enter a major: "); //double check major
				major = scnr.next();
				System.out.println("Enter if student is a graduate: ");
				isGraduate = scnr.nextBoolean();

				//first object case for Student
				System.out.println("STUDENTS:");
				Student student3 = new Student(name, birthYear, major, isGraduate);
				student3.isGraduate();
				System.out.println(student3.toString());

				System.out.println("*********************************");	
				System.out.println("*********************************");				
				System.out.println("All Student created: ");
				System.out.println(student1.toString());
				System.out.println(student2.toString());
				System.out.println(student3.toString());
				System.out.println("*********************************");
				System.out.println("*********************************");				
				System.out.println("");

//Now starting with the additional menu script to what the user inputs
//i started with adding two new courses to a faculty object. I do this by calling a single faculty object randomly 
//which I chose faculty one and I added a course taught to course one which corresponds With the faculty one then implement the add course taught method 
//which is created in our faculty class which was previously made during the beginning of the project
//Whatever addition has been made to this single faculty object will later be out printed once again with an additional 
//course being added as well
				System.out.println("Adding 2 new Courses to a Faculty object");
				faculty1.addCourseTaught(course1);
				System.out.println(faculty1.toString());
				faculty1.addCourseTaught(course1);
				System.out.println(faculty1.toString());
				System.out.println("");
//i have repeated the previous steps for adding two courses to a faculty object for the student object although I use a different method 'add course taken' which can be 
//found in the student class which we have previously made during the beginning of the project this Addition shall be shown through the to strings 
				System.out.println("Adding 2 new Courses to a Student object");
				student1.addCourseTaken(course1);
				System.out.println(student1.toString());
				student1.addCourseTaken(course1);
				System.out.println(student1.toString());
				System.out.println("");
//After this we have to add an array for two courses to a faculty object although this is a repetition of the previously stated adding two new courses to a faculty 
//object the addCoursesTaught array and the addCourseTaught affect the same out print on the to string method for faculty so I use the same method since it affects the same 
//part of the to string method -> this also goes for the student objects soon remade after this faculty object 
				System.out.println("Add an array of 2 Courses to a Faculty object");//check
				faculty1.addCourseTaught(course1);
				System.out.println(faculty1.toString());
				faculty2.addCourseTaught(course2);
				System.out.println(faculty2.toString());
				System.out.println("");
//as you can see below
				System.out.println("Add an array of 2 Courses to a Student object");
				student1.addCourseTaken(course1);
				System.out.println(student1.toString());
				student2.addCourseTaken(course2);
				System.out.println(student2.toString());
				System.out.println("");
//After this we need to get the course at a certain index where it is valid and invalid to get this we're using get course taught method which is previously created in the 
//faculty class and the index is numCoursestaught which will soon be affected due to the previous methods created .	
				System.out.println("Get the Course at index (valid and invalid indexes) from a Faculty object");
				faculty1.getCourseTaught(numCoursesTaught);
				System.out.println(faculty1.toString());
				System.out.println("");
//I repeat what I did in the faculty object to the student object although the method call is different = since we are deaing with the student object we'll be using the method call getCourseTaken 
//numb courses taught will fill in for the index in this method as well
				System.out.println("Get the Course at index (valid and invalid indexes) from a Student object");
				student1.getCourseTaken(numCoursesTaught);
				System.out.println(student1.toString());
				System.out.println("");
//moving on we have to determine which faculty object teaches the most and least courses for this I have created Multiple if statements Where I attempt to prove which faculty teaches the 
//most and least amount of courses Since This faculty method deals with the amount of courses that are being taught and that is not asked to be scanned by the user it has been affected through 
//the method I implemented in the class faculty. now viewing these if statements you can clearly see I am just attempting to prove that the faculty one is greater than faculty2 and faculty one is 
//greater than faculty three that proves that Faculty one has the most courses taught and I repeat that Style of proving that a certain faculty teaches the most or least amount.The least amount of 
//courses can be shown simply by changing the sign
				System.out.println("Determine which Faculty object teaches the most and the least courses");
				if(faculty1.getNumCoursesTaught()> faculty2.getNumCoursesTaught() && faculty1.getNumCoursesTaught() > faculty3.getNumCoursesTaught()) {
					System.out.println("Faculty1 object teaches the most courses");
				} 
				if(faculty2.getNumCoursesTaught()> faculty1.getNumCoursesTaught() && faculty2.getNumCoursesTaught() > faculty3.getNumCoursesTaught()) {
					System.out.println("Faculty2 object teaches the most courses");
				} 
				if(faculty3.getNumCoursesTaught()> faculty2.getNumCoursesTaught() && faculty3.getNumCoursesTaught() > faculty1.getNumCoursesTaught()) {
					System.out.println("Faculty3 object teaches the most courses");
				} 
				//find out which has the least amount
				if(faculty1.getNumCoursesTaught() < faculty2.getNumCoursesTaught() && faculty1.getNumCoursesTaught() < faculty3.getNumCoursesTaught()) {
					System.out.println("Faculty1 object teaches the least amount of courses");
				} 
				if(faculty2.getNumCoursesTaught() < faculty1.getNumCoursesTaught() && faculty2.getNumCoursesTaught() < faculty3.getNumCoursesTaught()) {
					System.out.println("Faculty2 object teaches the least amount of courses");
				} 
				if(faculty3.getNumCoursesTaught() < faculty2.getNumCoursesTaught() && faculty3.getNumCoursesTaught() < faculty1.getNumCoursesTaught()) {
					System.out.println("Faculty3 object teaches the least amount of courses");
				} 
				System.out.println("");
//Now to determine which course has the minimum and maximum in the courses catalog I use get course number which every course has a different number associated with them so the course number will prove whether 
//the course is the minimum or the maximum and I simply use if statements which resemble the faculty ones above just with a different method as well as a different objects being used, which is course one or course two 
//or course three as you can see the first three prove which is the most in the last three per which is the least			
				System.out.println("Determine which Course is the minimum and which is the maximum of all Course objects in the catalog.");
				if(course1.getCourseNum()> course2.getCourseNum() && course1.getCourseNum() > course3.getCourseNum()) {
					System.out.println("course1 object has the maximum number in the catalog");
				} 
				if(course2.getCourseNum()> course1.getCourseNum() && course2.getCourseNum() > course3.getCourseNum()) {
					System.out.println("course2 object has the maximum number in the catalog");
				} 
				if(course3.getCourseNum()> course2.getCourseNum() && course3.getCourseNum() > course1.getCourseNum()) {
					System.out.println("course3 object has the maximum number in the catalog");
				} 
				//find out which has the least amount
				if(course1.getCourseNum() < course2.getCourseNum() && course1.getCourseNum() < course3.getCourseNum()) {
					System.out.println("course1 object has the minimum number in the catalog");
				} 
				if(course2.getCourseNum() < course1.getCourseNum() && course2.getCourseNum() < course3.getCourseNum()) {
					System.out.println("course2 object has the minimum number in the catalog");
				} 
				if(course3.getCourseNum() < course2.getCourseNum() && course3.getCourseNum() < course1.getCourseNum()) {
					System.out.println("course3 object has the minimum number in the catalog");
				} 
				System.out.println("");

				
//Now repeating that same method to determine which student has the most and least amount of credits. although we are dealing with a student I had to use course objects to prove this because course allows you to get the number of 
//credits a student has. with that knowledge I made these if statements but just with a different system outprint stating that student one which correlates with course one has the most amount of credits because it’s greater 
//than course two which correlates with student two and it is also greater than course three which is associated with student three‘s number of credits
				System.out.println("Determine which Student has the most and least credits");
				//find out which is the greatest
				if(course1.getNumCredits()> course2.getNumCredits() && course1.getNumCredits() > course3.getNumCredits()) {
					System.out.println("student1 object has the most amount of credits");
				} 
				if(course2.getNumCredits()> course1.getNumCredits() && course2.getNumCredits() > course3.getNumCredits()) {
					System.out.println("student2 object has the most amount of credits");
				} 
				if(course3.getNumCredits()> course2.getNumCredits() && course3.getNumCredits() > course1.getNumCredits()) {
					System.out.println("student3 object has the most amount of credits");
				} 
				//find out which has the least amount
				if(course1.getNumCredits() < course2.getNumCredits() && course1.getNumCredits() < course3.getNumCredits()) {
					System.out.println("student1 object has the least amount of credits");
				} 
				if(course2.getNumCredits() < course1.getNumCredits() && course2.getNumCredits() < course3.getNumCredits()) {
					System.out.println("student2 object has the least amount of credits");
				} 
				if(course3.getNumCredits() < course2.getNumCredits() && course3.getNumCredits() < course1.getNumCredits()) {
					System.out.println("student3 object has the least amount of credits");
				} 
				System.out.println("");
//After that the system will out print if the user would like to start over and if they would like to start over then it’ll start them up at the top again asking if they'd like to enter inputs in the menu
			System.out.println("Do you want to start over? (Y/N)");
			startOver = scnr.next().charAt(0);
			if ((startOver==('Y')) || (startOver==('y'))) {
				break;
			} else if ((startOver==('N')) || (startOver==('n'))) {
				System.out.println("Goodbye");
			}
			}// end of while loop for the whole menu
		} //end of start over while loop
	}//end of main string
}// end of class

//Now allow me to attempt running the code to show you what this would look like written out

