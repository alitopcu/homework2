package homework2;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println(student.firstName + "" + student.lastName + "Başarıyla Kayıt Oldunuz!");
		System.out.println("Email : " + student.email + " \n " + "Şifre : " + student.password);
		System.out.println("------------------------------------------");
	}

}
