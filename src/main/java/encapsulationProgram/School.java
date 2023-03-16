package encapsulationProgram;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Riya");
		s.setPass(false);
		// s.setSchoolname("ABC SCHOOL");

		System.out.println("Name is " + s.getName());
		System.out.println("School name is " + s.getSchoolname());
		System.out.println("Boolean value is " + s.isPass());
	}

}
