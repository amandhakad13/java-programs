class Student {
	
	String name;
	int age;
	
	void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Rahul Verma";
		s1.age = 21;
		
		s1.displayInfo();
		
		s2.name = "Vijay Patidar";
		s2.age = 25;
		
		s2.displayInfo();
	}
}