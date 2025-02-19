package game;

public interface BasicSk {

	default void attack() {
		int ap = 10;
		System.out.println("기본공격을 합니다");
	}

	default void defence() {
		System.out.println("기본방어를 합니다");
	}
}