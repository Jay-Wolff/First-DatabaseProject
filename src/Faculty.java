
public class Faculty extends Employee implements Comparable<Faculty>{
	// you can assume that the maximum number of courses a faculty has taught cannot exceed 100
	private Course[] coursesTaught = new Course[100];
	private int numCoursesTaught;
	private boolean isTenured;
	
	//constructor // coursesTaught = [], numCoursesTaught = 0, isTenured = false
	public Faculty() {
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = false;
	}
	
	//extra constructor // coursesTaught = [], numCoursesTaught = 0, this.isTenured = isTenured
	public Faculty(boolean isTenured) {
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	//overloaded Constructor
	public Faculty(String deptName, boolean isTenured) {
		super(deptName);
		this.coursesTaught = new Course[100];
	    this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	//second overloaded constructor
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		super(name,birthYear,deptName);
		this.coursesTaught = new Course[100]; 
		this.numCoursesTaught = 0;
		this.isTenured = isTenured;
	}
	
	//Tenured
	public boolean isTenured() {
		return isTenured;
	}
	
	//setters and getters
	public int getNumCoursesTaught() {
		return numCoursesTaught;
	}
	
	public void setTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	
	
	//add courseTaught
	public void addCourseTaught(Course course){
		if(course == null) {
				return;
		}else if (numCoursesTaught< coursesTaught.length) {
			this.coursesTaught[numCoursesTaught++] = course ;
		} 
		
	}
	// add courses taught
	public void addCoursesTaught(Course [] course) { //appends courses to the existing method previously shown
		for(int i =0; i< course.length; i++) {
			addCourseTaught(course[i]);
		}
	}
	
	//extra getters
	public Course getCourseTaught(int index) { // note: index must be verified. Return "null" if invalid
		if(index<0 || index >= numCoursesTaught) {
			return null;
		} else {
		return this.coursesTaught[index];
		}
	}
	
	public String getCourseTaughtAsString(int index) { // note: index must be verified. Return "" if invalid returns "courseDept-courseNum"
		 if(index>= 0 && index < numCoursesTaught){
			 return coursesTaught[index].toString();
	   }
		return null;
		
	}
	
	public String getAllCoursesTaughtAsString() {  // comma seperated list of all courses taught uses getCourseTaughtAsString(int index) as a helper method
		String allCoursesAsString = "";
		for(int i = 0; i < numCoursesTaught;i++){
			  allCoursesAsString = coursesTaught[i].toString();
	   }
		return allCoursesAsString;
	}
	
	// equals method
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Faculty) {
			Faculty f1 = (Faculty) obj;
			if(this.coursesTaught == f1.coursesTaught) {
				if(this.numCoursesTaught == f1.numCoursesTaught) {
					if(this.isTenured == f1.isTenured) {
						if(this.getDeptName() == f1.getDeptName()) {
							if(this.getNumEmployees() == f1.getNumEmployees()) {
								if(this.getEmployeeID() == f1.getEmployeeID()) {
									return true;
								}	
							}
						}
					}
				}
			}

		}
		return false;
	}
	//toString method
	public String toString() {
        String s = "";
        if(this.isTenured)
            s = "Is Tenured";
        else
            s = "Not Tenured";
        return super.toString()+
                String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", s , numCoursesTaught, getAllCoursesTaughtAsString());
	}
	
	// use the Comparable interface specification, sort by numCoursesTaught
	@Override
	public int compareTo(Faculty f) {
		if(this.numCoursesTaught < f.compareTo((Employee) f)) {
			return -1;
		} if (this.numCoursesTaught > f.compareTo((Employee) f)) {
			return 1;
		}
		return super.compareTo((Employee) f);
	}
}
