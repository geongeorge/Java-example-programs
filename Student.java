public class Student {
	int id,roll;
	String name;
	void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Id : "+id);
		System.out.println();
	}
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 12;
		s1.name = "Geon George";
		s1.roll = 7;
		
		s2.id = 15;
		s2.name = "Wayne Maynard";
		s2.roll = 1;
		
		s1.displayInfo();
		s2.displayInfo();
		
	}
}	