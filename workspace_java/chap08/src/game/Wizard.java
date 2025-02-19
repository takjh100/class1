package game;

public class Wizard implements BasicSk, Attack{

	@Override
	public void attack() {
		int ap = 20;
		System.out.println("고급공격을 합니다");
	}

}
