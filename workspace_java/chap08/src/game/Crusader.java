package game;

public class Crusader implements BasicSk, Defence, Heal {

	@Override
	public void defence() {
		System.out.println("�߱޹� ����մϴ�");
	}

	@Override
	public void heal() {
		int mh = 15;
		System.out.println("�߱�ġ�Ḧ ����մϴ�");
	}

}
