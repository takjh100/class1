package game;

public class Crusader implements BasicSk, Defence, Heal {

	@Override
	public void defence() {
		System.out.println("중급방어를 사용합니다");
	}

	@Override
	public void heal() {
		int mh = 15;
		System.out.println("중급치료를 사용합니다");
	}

}
