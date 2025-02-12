package sec05.exam05._final;

public class Array {

//	int[] a = new int[3];
//	Array() {
//		System.out.println(a.length);
//		a.length// final 정수 변수
//		
//	}
	final int length;
	int[] arr;
	int cursor = 0;
	
	//length 는 배열의 크기
	Array(int length) {
	   this.length = length;
	   arr = new int[length];
	}
	//add 는 값을 넣는 메소드
	void add(int x) {
		if(this.cursor < this.length) {
			arr[this.cursor] = x;
			cursor++;
		}else {
			System.out.println("배열에 자리가 없습니다");
		}
	}
	//인덱스에 값을 넣었을때 해당 인덱스 배열의 값을 리턴
	int get(int index) {
		if(index < this.length) {
			return arr[index];
		}else {
			System.out.println("배열의 크기보다 큽니다");
			return Integer.MIN_VALUE;
		}
	}
}
