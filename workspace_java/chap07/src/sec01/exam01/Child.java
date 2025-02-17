package sec01.exam01;

public class Child extends Parent{
	
	//상속을 받았을 때의 기본 생성자
	Child() {
//		super();    //부모의 생성자, 생략 가능
		super(1);   //전달인자를 맞춰줘야 한다, 전달인자가 있을경우 생략이 불가능
//		this(2);    //this() 와 super()는 모두 첫줄에 적어야 하므로 같이 사용 불가
		             
		System.out.println("Child 생성자 실행");
	}
	Child(int a){
		super(1);
	}

	
	void printName() {
		System.out.println("name : " + name);
		System.out.println("this.name : " + this.name);
		String pName = getName();
		System.out.println("pName : " + pName);
		
	}
	
	//shadow :전달인자가 필드를 가리는 형상
	void setName(String name) {
		this.name = name;
	}
	
	int age;
	//overshadow : 부모의 필드를 가리는 현상
	String name = "Child의 name"; 
	
    String parentName() {
    	String name = null; //지역변수
    	String cName = this.name; // 내 필드
    	String pName = super.name; // 부모 필드
    	
		return super.name;
    }
    
    Child(String name){
		 super(name);
	}

}
