package NikalayevaPfeiffer;


import java.time.LocalDate;

public class Child {
	private String firstName;
	private String lastName;
	private Time timeInPlaygroup;
	private boolean transportation;
	private String allergies;
	private LocalDate DOB;
	private Parent parent;
	private String emergencyContact;

public Child(String firstName, String lastName, Time timeInPlaygroup, String allergies, LocalDate DOB, Parent parent, String emergencyContact) throws Exception {
	//if no transportation entered assuming kid doesn't get it
	if(validateDOB(DOB)) {
		this.DOB = DOB;
	}
	else {
		throw new Exception("Only kids between the ages 1-5 are allowed to the playgroup.");
	}
	this.transportation=false;
	this.firstName = firstName;
	this.lastName = lastName;
	this.timeInPlaygroup = timeInPlaygroup;
	this.allergies = allergies;
	this.parent = parent;
	this.emergencyContact = emergencyContact;
}
public Child(String firstName, String lastName, Time timeInPlaygroup, boolean transportation, String allergies,
		LocalDate DOB, Parent parent, String emergencyContact) throws Exception {
	if(validateDOB(DOB)) {
		this.DOB = DOB;
	}
	else {
		throw new Exception("Only kids between the ages 1-5 are allowed to the playgroup.");
	}
	this.firstName = firstName;
	this.lastName = lastName;
	this.timeInPlaygroup = timeInPlaygroup;
	this.transportation = transportation;
	this.allergies = allergies;
	this.parent = parent;
	this.emergencyContact = emergencyContact;
	
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setTimeInPlaygroup (Time timeInPlaygroup) {
	this.timeInPlaygroup = timeInPlaygroup;
}
public void setTransportation(boolean transportation) {
	this.transportation = transportation;
}
public void setAllergies(String allergies) {
	this.allergies = allergies;
}
public void setDOB(LocalDate DOB) throws Exception {
	if(validateDOB(DOB)) {
		this.DOB = DOB;
	}
	else {
		throw new Exception("Only kids between the ages 1-5 are allowed to the playgroup.");
	}
}
public void setParent (Parent parent) {
	this.parent = parent;
}
public void setEmergencyContact(String emergencyContact) {
	this.emergencyContact = emergencyContact;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public Time getTimeInPlaygroup() {
	return timeInPlaygroup;
}
public boolean getTransportation() {
	return transportation;
}
public String getAllergies() {
	return allergies;
}
public LocalDate getDOB() {
	return DOB;
}
public Parent getParent() {
	return parent;
}
public String getEmergencyContact() {
	return emergencyContact;
}
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("\t Name: " + firstName + lastName);
	sb.append("\t Time In Playgroup: " + timeInPlaygroup);
	sb.append("\t Transportation: " + transportation);
	sb.append("\t Allergy Information: " + allergies);
	sb.append("\t Date of Birth: " + DOB);
	sb.append("\t Parent Information: " + parent.toString());
	sb.append("\t Emergency Contact: " + emergencyContact);
	return sb.toString();
}

//compares based on fname+lname+DOB
public boolean equals(Child c) {
	if(this.firstName.equals(c.firstName)&&this.lastName.equals(c.lastName)&&this.DOB.equals(c.DOB)) {
		return true;
	}
	else {
		return false;
	}
}
private boolean validateDOB(LocalDate DOB) {
	//ages 1-5 are allowed to be in the playgroup
	LocalDate today=LocalDate.now();
	LocalDate from=today.minusDays(1825);
	LocalDate to=today.minusDays(365);
	if(!DOB.isBefore(from)&&!DOB.isAfter(to)) {
		return true;
	}
	return false;
}
}

