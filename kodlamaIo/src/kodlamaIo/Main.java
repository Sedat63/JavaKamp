package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		HomePage course1 = new HomePage();
		course1.id = 1;
		course1.title = "Yazýlým Geliþtirme Kampý (C# + Angular)";
		course1.explanation = "2 ay sürecek profesyonel programlama öðrenme";
		course1.price = "Ücretsiz";
		course1.lecturer = "Sedat ÖZTÜRK";
		
		HomePage course2 = new HomePage();
		course2.id = 2;
		course2.title = "Yazýlým Geliþtirme Kampý (Java + React)";
		course2.explanation = "2 ay sürecek profesyonel programlama öðrenme";
		course2.price = "Ücretsiz";
		course2.lecturer = "Engin Demiroð";
		
		HomePage course3 = new HomePage();
		course3.id = 3;
		course3.title = "Yazýlým Geliþtirme Kampý (JavaScript)";
		course3.explanation = "2 ay sürecek profesyonel programlama öðrenme";
		course3.price = "Ücretsiz";
		course3.lecturer = "Engin Demiroð";
		
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
