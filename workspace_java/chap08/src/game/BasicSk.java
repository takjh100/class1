package game;

public interface BasicSk {

	default void attack() {
		int ap = 10;
		System.out.println("�⺻������ �մϴ�");
	}

	default void defence() {
		System.out.println("�⺻�� �մϴ�");
	}
}