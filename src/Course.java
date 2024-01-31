public class Course {
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	//Overloaded Constructor for all instance variables initailized above
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		this.isGraduateCourse = isGraduateCourse;
		this.courseNum = courseNum;
		this.courseDept = courseDept;
		this.numCredits = numCredits;
	}
	
	public boolean isGraduateCourse() {
		//reinstatement of the boolean with an if/else statement because it wasn't running on zybooks correctly
		if(isGraduateCourse == true) {
			return true;
		} else {
			return false;
		}
	}

	//setters and getters
	public int getCourseNum() {
		return courseNum;
	}
	
	public String getCourseDept() {
		return courseDept;
	}
	
	public int getNumCredits() {
		return numCredits;
	}
	
	//additional getter //return String of U or G + courseDept + courseNum
	public String getCourseName() {
		return  (isGraduateCourse ? "G" : "U") + courseDept + courseNum; 
		/* if else statement in one line so if isGraduateCourse is G the system shall outprint G
		* while the else statement is to outprint U if U is entered for isGraduateCourse
		*/
	}

	//equals case //all attributes must match for 2 Course objects to be considered equal
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Course) {
			Course c1 = (Course) obj;
			if(this.isGraduateCourse == c1.isGraduateCourse) {
				if(this.courseNum == c1.courseNum) {
					if(this.courseDept == c1.courseDept) {
						if(this.numCredits == c1.numCredits) {	
							return true;
						}
					}
				}
			}

		}
		return false;
		//the equalsTo case proves if all atributes are equivalent to each other in order to ensure you'll outprint
		//the correct attributes in the toString method
	}
	
	// to string method
	//outprints all correct attributes
	@Override
	public String toString() {
		if(isGraduateCourse == true) { 
		//stating that if true the string will outprint all attributes as well as "Graduate"
		String c =String.format( "Course: %3s-%3d | Number of Credits: %02d | Graduate", courseDept,courseNum,numCredits,isGraduateCourse );
		return c;
	} if (isGraduateCourse == false) {
		//stating that if the user isn't in graduate courses (false) the string will 
		//outprint all attributes as well as "Undergraduate"
		String c =String.format( "Course: %3s-%3d | Number of Credits: %02d | Undergraduate", courseDept,courseNum,numCredits,isGraduateCourse );
		return c;
	}
	return null;
	}
	
	//Comparable interface //use the Comparable interface specification. Sort by courseNum
	public int compareTo(Course c) {
		return this.courseNum - c.courseNum;
	}
}
// another compare method System.out.println(a + " comparing with " + b + " = " + a.equals(b)); 









