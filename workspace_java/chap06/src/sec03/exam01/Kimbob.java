package sec03.exam01;

import java.util.ArrayList;

//김밥천국 관리 클래스
public class Kimbob {

	String name;  //지점명
	String address; //주소
	
//	String[] menu;  //메뉴
//	int[] price;  //메뉴와 순서를 맞춰서 관리하는 가격
	
	ArrayList menu;  //메뉴
	ArrayList price;  //메뉴와 순서를 맞춰서 관리하는 가격
	
	int seedMoney; //권리금
	
	Kimbob(int seedMoney){
		System.out.println("Kimbob(int)생성자 실행");
		this.seedMoney = seedMoney;
		
		this.menu = new ArrayList();
		this.price = new ArrayList();
		
		this.menu.add("야채");
//		System.out.println(this.menu.get(0)); ArrayList를 가지고올때
//		for(int i=0;i<this.menu.size(); i++) for문에서는 size를 사용
		this.price.add(3500);
		
		this.menu.add("라면");
		this.price.add(4000);
		
	}
	
	/**
	 * 김밥싸기
	 * 
	 * @parameter String main, String sub
	 * 
	 * @return String 완성품이름
	 */
	String makeRoll(String main) {
		System.out.println(main +"(으)로 김밥을 만듭니다");
		
		String result = main +"김밥";
		return result;
	}
	
	/**
	 * 영수증 출력
	 * 
	 * @parameter int index 메뉴번호, int count 개수
	 * 
	 * @return void
	 */
	void print(int index, int count) {
		String menuname = (String)this.menu.get(index);
		int menuPrice = (int)this.price.get(index);
		
		System.out.println("----------");
		System.out.println("메뉴명 :"+ menuname);
		System.out.println("주문수 :"+ count);
		System.out.println("----------");
		System.out.println("총 금액 :"+(menuPrice*count));
		System.out.println("----------");
	}
	/**
	 * 주문하기
	 * 
	 * @param int index 메뉴번호
	 * @return void
	 * 
	 */
	void order(int index) {
		String menuname = (String)this.menu.get(index);
		String result = makeRoll(menuname);
		System.out.println("주문하신"+result+"나왔습니다");
	}
	
	/**
	 * 메뉴 추가
	 * 
	 * @param String 메뉴명, int 가격
	 * @return void
	 * 
	 */
	
	void menupuls(String manuName, int manuPrice){
		
		this.menu = new ArrayList();
		this.price = new ArrayList();
		this.menu.add(manuName);
		this.price.add(manuPrice);
		System.out.println("메뉴판에"+manuName+"을 추가합니다");
		System.out.println(manuName+"의 가격은 :"+manuPrice+"입니다");
	}
	
	/**
	 * 전체 메뉴와 가격 확인
	 * 야채 :3500원
	 * 라면 :4000원
	 * @param
	 * @return void
	 * 
	 * 
	 */
	
	void PrintMenu() {
		for(int i=0;i<this.menu.size();i++) {
			System.out.println(this.menu.get(i)+":"+this.price.get(i));
		}
	}
	
}
