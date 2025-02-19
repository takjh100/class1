package sec01.exam01;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int vol);
	
	default void mic(String text) {
		
	}
}
