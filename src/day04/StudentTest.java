package day04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		//System.out.println(studentLee.serialNum);
		//System.out.println(Student.serialNum);
		//studentLee.serialNum++;
		
		System.out.println(Student.getSerialNum());
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		//System.out.println(studentSon.serialNum);
		System.out.println(Student.getSerialNum());
		System.out.println(studentSon.studentName + " �й� : " + studentSon.studentID);
		
	}

}
