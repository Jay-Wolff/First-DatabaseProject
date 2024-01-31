public class Student extends Person {
	private static int numStudents = 0;
	private int studentID; //generated
	private Course[] coursesTaken; 
	private int numCoursesTaken =0; //controlled variable
	private boolean isGraduate;
	private String major;
	
	// constructor // coursesTaken = [], numCoursesTaken = 0, isTenured = false
	public Student() { 
		this.numStudents ++;
		this.studentID = studentID;
		this.major = "undeclared";
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
		

	}
	//additional constructors
	public Student(boolean isGraduate) {
		this.isGraduate = isGraduate;
		this.numStudents ++;
		this.major = "undeclared";
		this.studentID = studentID;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		
	}
	public Student(String major, boolean isGraduate) {
		this.major = major;
		this.isGraduate = isGraduate;
		this.numStudents ++;
		this.studentID = studentID;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
		this.major = (major.contentEquals("") ? "Undeclared" : major);
		this.isGraduate = isGraduate;
		this.numStudents ++;
		this.studentID = studentID;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}
	
	public boolean isGraduate() {
		return isGraduate;
	}
	//setters and getters 
	public int getNumCoursesTaken() {
		return numCoursesTaken;
	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public int getStudentID() {
		studentID = numStudents;
			return studentID;
	}
	

	public String getMajor() {
		return  major;
	}
	
	public void setGraduate(boolean isGraduate) {
		if(isGraduate == true) {
		}else if (isGraduate == false){
		}
	}
	
	
	//addCourseTaken //appends courses to the end of the existing array
	public void addCourseTaken(Course course){
		if(course == null) {
			return;
		}else if (numCoursesTaken< coursesTaken.length) {
		this.coursesTaken[numCoursesTaken++] = course ;
		}
	}
	// addCoursesTaken //appends courses to the end of the existing array
	public void addCoursesTaken(Course [] course) {
		for(int i =0; i< course.length; i++) {
			addCourseTaken(course[i]);
		}
	}
	
	//two more getters
	public Course getCourseTaken(int index) { // note: index must be verified. Return "null" if invalid
		if(index<0 || index >= numCoursesTaken) {
			return null;
		} else {
		return this.coursesTaken[index];
		}
	}
	
	//get courses as a string // note: index must be verified. Return "" if invalid returns "courseDept-courseNum"
	public String getCourseTakenAsString(int index) {
		if(index<0 || index >= numCoursesTaken) {
			return coursesTaken[index].toString();
		} else {
		return "";
		}
	}
	
	//get ALL courses as a string // comma separated list of all courses taught uses getCourseTakenAsString(int index) as a helper method
	public String getAllCoursesTakenAsString() {
		String allCoursesTaken = "";
        for(int index = 0; index < numCoursesTaken; index++) {
        	allCoursesTaken += coursesTaken[index].toString();
        }
        return allCoursesTaken;
    }
	
	//equals method //all attributes inherited+local must match for 2 Student objects to be considered equal
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student s1 = (Student) obj;
			if(this.numStudents == s1.numStudents) {
				if(this.studentID == s1.studentID) {
					if(this.coursesTaken == s1.coursesTaken) {
						if(this.numCoursesTaken == s1.numCoursesTaken) {
							if(this.isGraduate == s1.isGraduate) {
								if(this.major == s1.major) {
									if(this.getName() == s1.getName()) {
										if(this.getBirthYear() == s1.getBirthYear()) {
									return true;
										}
									}	
								}	
							}
						}
					}
				}
			}

		}
		return false;
	}
	//to String method
	public String toString() {
        return super.toString()+ String.format(" Student: studentID: %04d | Major %20s | " + String.format("%14s",(isGraduate ? "Graduate" : "Undergraduate"))+ " | Number of Courses Taken: %3d | Courses Taken: %s", studentID, major, numCoursesTaken, getAllCoursesTakenAsString());
	}
	
	//comparable interface //use the Comparable interface specification, sort by numCredits
	
	public int compareTo(Student s) {
		if(this.studentID < s.compareTo((Person) s)) {
			return -1;
		} if (this.studentID > s.compareTo((Person) s)) {
			return 1;
		}
		return super.compareTo((Person) s);
	}
}
