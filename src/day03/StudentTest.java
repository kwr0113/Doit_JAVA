package day03;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setStudentName("�ȿ���");
		
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.setStudentName("�Ƚ¿�");

		System.out.println(student2.getStudentName());

		// ���� �� ����ϱ�
		System.out.println(student1);
		System.out.println(student2);
		
		
	}

}
