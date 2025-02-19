package game;

public class Priest implements BasicSk, Heal {

	@Override
	public void heal() {
		int th = 20;
		System.out.println("고급치료를 합니다");
	}

}
