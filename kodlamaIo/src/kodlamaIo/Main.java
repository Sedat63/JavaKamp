package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		HomePage course1 = new HomePage();
		course1.id = 1;
		course1.title = "Yaz�l�m Geli�tirme Kamp� (C# + Angular)";
		course1.explanation = "2 ay s�recek profesyonel programlama ��renme";
		course1.price = "�cretsiz";
		course1.lecturer = "Sedat �ZT�RK";
		
		HomePage course2 = new HomePage();
		course2.id = 2;
		course2.title = "Yaz�l�m Geli�tirme Kamp� (Java + React)";
		course2.explanation = "2 ay s�recek profesyonel programlama ��renme";
		course2.price = "�cretsiz";
		course2.lecturer = "Engin Demiro�";
		
		HomePage course3 = new HomePage();
		course3.id = 3;
		course3.title = "Yaz�l�m Geli�tirme Kamp� (JavaScript)";
		course3.explanation = "2 ay s�recek profesyonel programlama ��renme";
		course3.price = "�cretsiz";
		course3.lecturer = "Engin Demiro�";
		
		HomePage[] courses = {course1,course2,course3};
		
		for (HomePage course : courses) {
			System.out.println( course.id +" "+ course.title+" "+course.explanation+" "+
		course.price+" "+course.lecturer);
		}

		CampManager campManager = new CampManager();
		campManager.addToList(course1);
		campManager.addToList(course2);
		campManager.addToList(course3);
	}

}
