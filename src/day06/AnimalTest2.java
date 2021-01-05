package day06;

import java.util.ArrayList;

class Animal2 {
	
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human2 extends Animal2 {
	
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger2 extends Animal2 {
	
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void huting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle2 extends Animal2 {
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� �ǰ� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest2 {
	
	ArrayList<Animal2> aniList2 = new ArrayList<Animal2>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest2 = new AnimalTest2();
		aTest2.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest2.testCating();
	}
	
	public void addAnimal() {
		aniList2.add(new Human2());
		aniList2.add(new Tiger2());
		aniList2.add(new Eagle2());
		
		for(Animal2 ani : aniList2) {
			ani.move();
		}
	}

	public void testCating() {
		for(int i = 0; i < aniList2.size(); i++) {
			Animal2 ani = aniList2.get(i);
			if(ani instanceof Human2) {
				Human2 h = (Human2)ani;
				h.readBook();
			} else if (ani instanceof Tiger2) {
				Tiger2 t = (Tiger2)ani;
				t.huting();
			} else if (ani instanceof Eagle2) {
				Eagle2 e = (Eagle2)ani;
				e.flying();
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	
}








