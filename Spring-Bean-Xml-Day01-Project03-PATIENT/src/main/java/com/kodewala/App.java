package com.kodewala;
// This defines the package where this class (App.java) is located.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// These imports allow us to use Spring's ApplicationContext and load XML configuration.

import com.kodewala.pojo.Patient;
// Importing the Patient class so we can use it inside main().

public class App { // Start of App class.
	public static void main(String[] args) { // Main method → program execution starts here.

		String xmlFile = "resource\\applicationContext.xml";
		// This line stores the path of your Spring XML file.
		// Spring will read this file to create and configure beans (objects).

		ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);
		// Spring container is created here.
		// It loads applicationContext.xml and creates all Patient objects defined
		// inside XML.

		// ---------------- OLD APPROACH (MANUAL WAY) ----------------
		// You commented this part because it is long and repetitive.
		// This method was:
		// 1. Get p1
		// 2. Print details
		// 3. Get p2
		// 4. Print details
		// 5. Get p3
		// 6. Print details
		// Now you replaced it with a loop to make code shorter.
		// -----------------------------------------------------------

		String[] beanIds = { "p1", "p2", "p3" };
		// Creating a list (array) of bean IDs.
		// These IDs match the bean names in XML: p1, p2, p3.
		// We will loop through these IDs to fetch and print each patient.

		for (String id : beanIds) {
			// Loop starts → runs 3 times.
			// 1st time: id = "p1"
			// 2nd time: id = "p2"
			// 3rd time: id = "p3"

			Patient p = (Patient) context.getBean(id);
			// Using Spring to fetch the bean (object) whose id matches the current loop
			// value.
			// Example:
			// When id = "p1", Spring returns Patient object for p1.
			// When id = "p2", Spring returns Patient object for p2.

			System.out.println("Patient Name: " + p.getName());
			// Printing patient name using getter method.

			System.out.println("Patient Disease: " + p.getDisease());
			// Printing patient disease.

			System.out.println("Patient Age: " + p.getAge());
			// Printing patient age.

			System.out.println("------------------------------------");
			// Printing a separator line to make the output clean.
		}
	}
}
