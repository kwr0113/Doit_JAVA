package day03.constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.0F;
		personKim.weight = 85.8F;
		
		Person personLee = new Person("이순신", 175, 175);
	}
}
