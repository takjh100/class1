package sec01.exam01;

public class Tv implements RemoteControl, Searchable {

	int vol;

	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�");
	}

	@Override
	public void setVolume(int vol) {

//		if(vol < RemoteControl.MIN_VOLUME) {
//			System.out.println("0~10���� ���� �Է��ϼ���");
//		}else if(vol > RemoteControl.MAX_VOLUME) {
//			System.out.println("0~10���� ���� �Է��ϼ���");
//		}else {
//			this.vol = vol;
//			System.out.println(vol + "�� ������ �ٲߴϴ�");
//		}

		int result = vol;
		if (vol < RemoteControl.MIN_VOLUME)
			result = RemoteControl.MIN_VOLUME;
		if (vol > RemoteControl.MAX_VOLUME)
			result = RemoteControl.MAX_VOLUME;

		this.vol = vol;
	}

	@Override
	public void Search(String text) {
		System.out.println("TV�� " + text + "�� �˻��մϴ�");
	}

}
