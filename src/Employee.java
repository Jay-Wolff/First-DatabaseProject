public class Employee extends Person {
	private String deptName;
	private static int numEmployees = 0;
	private int employeeID;
	
	//constructor // deptName = "", employeeID computed
	public Employee() {
		this.deptName = "";
		this.numEmployees ++;
		this.employeeID = employeeID; //generated 
	}
	
	//second constructor // employeeID computed
	public Employee(String deptName) {
		this.deptName = deptName;
		this.employeeID=employeeID;
	}
	
	//overloaded constructor // employeeID computed
	public Employee(String name, int birthYear, String deptName) {
		super(name, birthYear);
		this.deptName = deptName;
		this.employeeID=employeeID;
	}

	//setters and getters
	public String getDeptName() {
		return deptName;
	}
	
	public static int getNumEmployees() {
		return numEmployees;
	}
	
	public int getEmployeeID() {
		employeeID = numEmployees;
		return employeeID;
	   }
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	//equals method //all attributes inherited+local must match for 2 Employee objects to be considered equal
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Employee) {
			Employee e1 = (Employee) obj;
			if(this.deptName == e1.deptName) {
				if(this.numEmployees == e1.numEmployees) {
					if(this.employeeID == e1.employeeID) {
						if(this.getName() == e1.getName()) {
							if(this.getBirthYear() == e1.getBirthYear()) {
									return true;
							}
						}
					}
				}
			}

		}
		return false;
	}
	
	//to string method 
	@Override
	public String toString() {
		String e =String.format("Person: Name: %30s | Birth Year: %4d Employee: Department: %20s | Employee Number: %3d", getName(), getBirthYear(), deptName, getEmployeeID());
		return e;
	}
	
	//comparable interface //use the Comparable interface specification. Sort by employeeID
	
}
