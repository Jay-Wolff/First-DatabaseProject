
public class Person {
	private String name;
	private int birthYear;
	
	//constructor // name = , birthYear = 0

	public Person() {
		this.name = "";
		this.birthYear = 0;
	}
	
	//Overloaded Constructor 
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	//setters and getterrs
	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int year) {
		this.birthYear = year;
	}
	
	// equals method //all attributes must match for 2 Course objects to be considered equal
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person p1 = (Person) obj;
			if(this.name == p1.name) {
				if(this.birthYear == p1.birthYear) {
					return true;
				}
			}
		}
		return false;
	}
	
	// toString method
	@Override
	public String toString() {
		String p =String.format("Person: Name: %30s | Birth Year: %4d", name,birthYear);
		return p;
	}
	
	//Comparable Interface //use the Comparable interface specification. Sort by birthYear.
	public int compareTo(Person p) {
		return this.birthYear - p.birthYear;
	}
}
