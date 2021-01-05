package day06;

import java.util.ArrayList;

class Animal2 {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human2 extends Animal2 {
	
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger2 extends Animal2 {
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void huting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle2 extends Animal2 {
	
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 피고 멀리 날아갑니다.");
	}
}

public class AnimalTest2 {
	
	ArrayList<Animal2> aniList2 = new ArrayList<Animal2>();
	
	public static void main(String[] args) {
		AnimalTest2 aTest2 = new AnimalTest2();
		aTest2.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
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
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
}








