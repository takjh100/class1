package sec05.exam05._final;

public class ArrayExam {

	public static void main(String[] args) {

		int[] a = new int[5];
		a[0] = 1;
		
		//생성하고 나서 
		//add()에 값을 넣으면 자동으로 현재 index에 추가
		//   단, 크기를 벗어나면 "에러 문구 출력"
		//get()에 index를 넣으면 그 index의 값을 return함
		
		Array array = new Array(3);
		array.add(10000);
		array.add(1234);
		array.add(2);
		array.add(3);
		
		int b = array.get(1);
		System.out.println(b);
	}

}
