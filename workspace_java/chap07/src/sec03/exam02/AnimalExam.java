package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {

		//추상클래스는 new 할 수 없다
//		new Animal();
		Cat cat = new Cat();
		Animal a = cat;
		a.sound();
		cat = (Cat)a;
	
		Cat cat3 = new Cat();
		cat3.name = "고양이 1호";
		setName(cat3);
		System.out.println(cat3.name);
	}
	
	//얕은 복사
	//전달인자로 참조타입이 가는 경우 무조건 얕은복사로 간다
	//전달인자로는 stack 영역의 값만 복사되어 전달된다
	static void setName(Cat cat) {
		cat.name = "고양이 2호";
	}
	
	//깊은복사
	static Cat testName(Cat cat) {
		Cat cat2 = new Cat();
		cat2.name = cat.name;
		
		cat2.name = "고양이 2호";
		return cat2;
	}

}
