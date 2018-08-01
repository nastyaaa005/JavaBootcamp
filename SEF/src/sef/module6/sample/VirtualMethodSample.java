package sef.module6.sample;

public class VirtualMethodSample {
	public static void main(String arg[]){
		Person_P p = new Person_P();
		p.setName("John Doe");
		
		//Student inherits the methods and behavior from the Person class
		Student_P s = new Student_P();
		s.setName("Jane Doe");
	
		s.setSchool("A Fictional School");
		s.setGrade(10);
	
		rollCall(p);
		rollCall(s);
	}
	// ja ir klases kas paplašina person P tad arī tās var padot rollCall metodei
	//piemēram student S
	public static void rollCall(Person_P temp){
			temp.announce();
	}}

