public class GeneralStaff extends Employee{
	private String duty;
	
	//constructor
	public GeneralStaff() {
		this.duty = "";
	}
	
	//Overloaded Constructor
	public GeneralStaff(String duty) {
		this.duty = duty;
	}
	
	//overloaded constructor with variables from Employee
	public GeneralStaff(String deptName, String duty) {
		super(deptName);
		this.duty = duty;
	}
	
	//overloaded constructor with variables from Employee as well as Person
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		super(name, birthYear, deptName);
		this.duty = duty;
	}

	// getter method
	public String getDuty() {
		return duty;
	}

	//equals method //all attributes inhereted+local must match for 2 Staff objects to be considered equal
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof GeneralStaff) {
			GeneralStaff g1 = (GeneralStaff) obj;
			if(this.getName() == g1.getName()) {
				if(this.getBirthYear() == g1.getBirthYear()) {
					if(this.getDeptName() == g1.getDeptName()) {
						if(this.duty == g1.duty) {
							return true;	
						}
					}
				}
			}
		}
		return false;
	}
	
	//to String method
	public String toString() {
		String g =String.format("Person: Name: %30s | Birth Year: %4d Employee: Department: %20s | Employee Number: %3d GeneralStaff: Duty: %10s", getName(), getBirthYear(), getDeptName(), getEmployeeID(), duty );
		return g;
	}
	
	//Note: do not override the inherited compareTo from the Employee class (use as is)
	
}
