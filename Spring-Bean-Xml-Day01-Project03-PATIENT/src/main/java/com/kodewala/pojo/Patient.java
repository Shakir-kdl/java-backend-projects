package com.kodewala.pojo;
// This is the package name. 

// It helps keep your project organized and groups related classes together.

public class Patient {
	// This class represents a Patient object.
	// Spring will create objects of this class using the XML file.

	private String name; // Stores the name of the patient.
	private String disease; // Stores the disease of the patient.
	private int age; // Stores the age of the patient.

	public String getName() {
		return name;
	}
	// Getter method for name.
	// It gives (returns) the current patient’s name.

	public void setName(String name) {
		this.name = name;
	}
	// Setter method for name.
	// Spring uses this to set patient name from XML.
	// Example in XML: <property name="name" value="Shakir"/>

	public String getDisease() {
		return disease;
	}
	// Getter for disease → returns the patient's disease.

	public void setDisease(String disease) {
		this.disease = disease;
	}
	// Setter for disease.
	// Spring uses this method to set the disease value from XML.

	public int getAge() {
		return age;
	}
	// Getter for age → returns the patient's age.

	public void setAge(int age) {
		this.age = age;
	}
	// Setter for age.
	// Spring calls this to set the age value written in XML.

}
