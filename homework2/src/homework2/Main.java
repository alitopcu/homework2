package homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Ali ", "Topçu ", "ali123@hotmail.com", 12345);
		Student student2 = new Student("Hüseyin ", "Palamar ", "hüseyin123@hotmail.com", 123456);

		System.out.println("------------------------------------------");

		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student2);
		studentManager.addStudent(student1);
		
		Course course1 = new Course("Java+React ", "Engin Demirog", 1);
		Course course2 = new Course("C# ve Angular ", "Engin Demirog", 2);

		System.out.println("------------------------------------------");

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		
		Category category1 = new Category(1,"Programlama","Yeni baþlýyanlar için programlama");
		Category category2 = new Category(2,"Web Programlama","Ýleri seviye PHP programlama");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);
		
		
		
		
		
		
		

	}

}
