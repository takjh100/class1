package quiz;


import java.util.Scanner;

public class Cafe {

	//1.생산하려는 커피의 종류를 선택할 수 있게 해주세요
	/* 
	 * 카페의 카테고리를 클래스의 필드로 지정해두고
	 * 카테고리 메소드를 만들어 
	 * if 문을 통해서 선택한 값의 카테고리 메뉴들이 
	 * 나올 수 있도록 한다
	 * 몇번의 주문이 있을지 예상이 안되니 배열을 사용
	 *  
	 */
			
	//2.카테고리의 종류에 따라 상세 종류를 선택할 수 있게 해주세요
	/*
	 *카테고리별 메소드를 만들어 메소드안에 메뉴들을 넣을 if문을생성 
	 */
	
	//3.필요한 경우 더 상세한 내용을 선택할 수 있게 해주세요. 필요없을경우 생략 가능합니다
	/*
	 * 메뉴별 추가선택(핫,아이스,샷추가등)의 if문을 
	 * 이중으로추가한다 
	 */
	//4.각각 선택할 메뉴 표시에 가격이 정해져 있다면 가격도 같이 표시해주세요
	/*
	 * 메뉴별 가격을 가격필드를 생성해 더해주고
	 * 가격을 프린트한다  
	 * 
	 */
	//5.선택한 내용을 확인할 수 있게 출력해 주세요
	/*
	 * 메뉴 추가한 것들이 다 나올수 있도록 메뉴를 필드에 담고
	 * 전체 주문 메뉴를 출력할 메소드를 생성한다 
	 * 
	 * 
	 */
	//6.언제나 처음 단계로 돌아갈 수 있는 기능이 필요합니다
	/*
	 * break를 통해 처음으로 돌아가도록 기능을 만든다
	 */
	//7.언제나 종료할 수 있는 기능이 필요합니다
	/*
	 * break를 통해 종료할수있도록 기능을 만든다
	 */
	
	String[] category = new String[10];
	String[] menu= new String[10];
	String[] addMenu= new String[10];
    int clist;
    int mlist;
    int alist;
    int count;
	
	int money;
	Scanner scanner = new Scanner(System.in);
	int scan = 0;
	int scan2 = 0;

	void cafe() {
		System.out.println("카테고리를 선택해주세요");
		System.out.println("1.커피, 2.주스, 3.디저트, 4.주문종료 5.프로그램 종료");
		scan = scanner.nextInt();

		while (true) {
			for(int i=0;i<this.category.length; i++) {
			if (scan == 1) {
				System.out.println("커피메뉴를 선택해주세요");
				System.out.println("1.아메리카노, 2.라떼, 3.카푸치노, 4.주문종료 5.프로그램 종료");
				category[i] = "커피";
				clist = i;
				coffee(scan);
			} else if (scan == 2) {
				System.out.println("주스메뉴를 선택해주세요");
				System.out.println("1.사과주스, 2.수박주스, 3.청포도주스, 4.주문종료 5.프로그램 종료");
				category[i] = "주스";
				clist = i;
				ade(scan);
			} else if (scan == 3) {
				System.out.println("디저트메뉴를 선택해주세요");
				System.out.println("1.마들렌, 2.휘낭시에, 3.브라우니, 4.주문종료 5.프로그램 종료");
				category[i] = "디저트";
				clist = i;
				dessert(scan);
			} else if (scan == 4) {
				System.out.println("주문을 종료합니다");
				break;
			} else if (scan == 5) {
				System.out.println("프로그램을 종료합니다");
				break;

			} else {
				System.out.println("제대로 입력해 주세요");
			}
			count += 1;
			}break;
		} // while
	}// cage

	void coffee(int x) {
		scan = scanner.nextInt();
		while (true) {
			for(int i=0;i<this.menu.length;i++) {
			if (scan == 1) {
				System.out.println("아메리카노:3000원");
				money += 3000;
				this.menu[i] = "아메리카노";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.아이스, 2.핫, 3.샷추가, 4.주문종료 5.프로그램 종료");
				addition(scan);
			} else if (scan == 2) {
				System.out.println("라떼:4000원");
				money += 4000;
				this.menu[i] = "라떼";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.아이스, 2.핫, 3.샷추가, 4.주문종료 5.프로그램 종료");
				addition(scan);
			} else if (scan == 3) {
				System.out.println("카푸치노:4500원");
				money += 4500;
				this.menu[i] = "카푸치노";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.아이스, 2.핫, 3.샷추가, 4.주문종료 5.프로그램 종료");
				addition(scan);
			} else if (scan == 4) {
				System.out.println("주문을 종료합니다");
				break;
			} else if (scan == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("제대로 입력해 주세요");
			}
			
			}
		} // while

	}// coffee

	void ade(int x) {
		scan = scanner.nextInt();
		while (true) {
			for(int i=0;i<this.menu.length+1; i++) {
			if (scan == 1) {
				System.out.println("사과주스:4000원");
				money += 4000;
				this.menu[i] = "사과주스";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.아이스, 2.핫, 3.샷추가, 4.주문종료 5.프로그램 종료");
				addition(scan);
			} else if (scan == 2) {
				System.out.println("수박주스:4500원");
				money += 4500;
				this.menu[i] = "수박주스";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.아이스, 2.핫, 3.샷추가, 4.주문종료 5.프로그램 종료");
				addition(scan);
			} else if (scan == 3) {
				System.out.println("청포도주스:5000원");
				money += 5000;
				this.menu[i] = "청포도주스";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.아이스, 2.핫, 3.샷추가, 4.주문종료 5.프로그램 종료");
				addition(scan);
			} else if (scan == 4) {
				System.out.println("주문을 종료합니다");
				break;
			} else if (scan == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("제대로 입력해 주세요");
			}
			
			}
		} // while

	}// ade

	void dessert(int x) {
		scan = scanner.nextInt();
		while (true) {
			for(int i=0;i<this.menu.length; i++) {
			if (scan == 1) {
				System.out.println("마들렌:2000원");
				money += 2000;
				this.menu[i] = "마들렌";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.휘핑크림추가, 2.시럽추가, 3,초코칩추가, 4.주문종료 5.프로그램 종료");
				additio2(scan);
			} else if (scan == 2) {
				System.out.println("휘낭시에:2500원");
				money += 2500;
				this.menu[i] = "휘낭시에";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.휘핑크림추가, 2.시럽추가, 3,초코칩추가, 4.주문종료 5.프로그램 종료");
				additio2(scan);
			} else if (scan == 3) {
				System.out.println("브라우니:3000원");
				money += 3000;
				this.menu[i] = "브라우니";
				mlist = i;
				System.out.println("추가사항를 선택해주세요");
				System.out.println("1.휘핑크림추가, 2.시럽추가, 3,초코칩추가, 4.주문종료 5.프로그램 종료");
				additio2(scan);
			} else if (scan == 4) {
				System.out.println("주문을 종료합니다");
				break;
			} else if (scan == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("제대로 입력해 주세요");
			}
			
			}
		}

	}// dessert

	void addition(int x) {
		scan = scanner.nextInt();

		while (true) {
			for(int i=0;i<this.addMenu.length; i++) {
			if (scan == 1) {
				System.out.println("아이스:500원");
				money += 500;
				this.addMenu[i] = "아이스";
				alist = i;
				System.out.println("주문이 완료되었습니다");
//				list();
				addorder();
				
			} else if (scan == 2) {
				System.out.println("핫:0원");
				this.addMenu[i] = "핫";
				alist = i;
				System.out.println("주문이 완료되었습니다");
//				list();
				addorder();
				
			} else if (scan == 3) {
				System.out.println("추가없음");
				this.addMenu[i] = "추가없음";
				alist = i;
				System.out.println("주문이 완료되었습니다");
//				list();
				addorder();
				
			} else if (scan == 4) {
				System.out.println("주문을 종료합니다");
				break;
			} else if (x == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("제대로 입력해 주세요");
			}break;
			}
		}

	}

	void additio2(int x) {
		scan = scanner.nextInt();

		while (true) {
			for(int i=0;i<this.addMenu.length; i++) {
			if (scan == 1) {
				System.out.println("휘핑크림추가:800원");
				money += 800;
				this.addMenu[i] = "휘핑크림추가";
				alist = i;
				System.out.println("주문이 완료되었습니다");
//				list();
				addorder();
				break;
			} else if (scan == 2) {
				System.out.println("시럽추가:200원");
				money += 200;
				this.addMenu[i] = "시럽추가";
				alist = i;
				System.out.println("주문이 완료되었습니다");
//				list();
				addorder();
				break;
			} else if (scan == 3) {
				System.out.println("추가없음");
				this.addMenu[i] = "추가없음";
				alist = i;
				System.out.println("주문이 완료되었습니다");
//				list();
				addorder();
				break;
			} else if (scan == 4) {
				System.out.println("주문을 종료합니다");
				break;
			} else if (scan == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("제대로 입력해 주세요");
			}break;
			}
		}

	}

	void list() {
		for(int i=0;i<count+1;i++) {
	
        System.out.println("-----주문목록-----");
		System.out.print(category[clist] + "/");
		System.out.print(menu[mlist] + "/");
		System.out.println(addMenu[alist] + "/");
		}
		System.out.println("총금액 : " + money);
	}

	void addorder() {
		System.out.println("--------------------");
		System.out.println("추가주문하시겠습니까?");
		System.out.println("1.네, 2.아니오, 3.주문목록결제하기");
		scan2 = scanner.nextInt();
		while (true) {
			if (scan2 == 1) {
				cafe();
			} else if (scan2 == 2) {
				list();
				System.out.println("감사합니다 음식을 준비하겠습니다");
				break;
			}else if (scan2 == 3) {
				list();
				System.out.println("결제가 완료되었습니다");
			}
			
		}
	}
}
