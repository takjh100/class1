package sec01.exam01;

public class Child extends Parent{
	
	//����� �޾��� ���� �⺻ ������
	Child() {
//		super();    //�θ��� ������, ���� ����
		super(1);   //�������ڸ� ������� �Ѵ�, �������ڰ� ������� ������ �Ұ���
//		this(2);    //this() �� super()�� ��� ù�ٿ� ����� �ϹǷ� ���� ��� �Ұ�
		             
		System.out.println("Child ������ ����");
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
	
	//shadow :�������ڰ� �ʵ带 ������ ����
	void setName(String name) {
		this.name = name;
	}
	
	int age;
	//overshadow : �θ��� �ʵ带 ������ ����
	String name = "Child�� name"; 
	
    String parentName() {
    	String name = null; //��������
    	String cName = this.name; // �� �ʵ�
    	String pName = super.name; // �θ� �ʵ�
    	
		return super.name;
    }
    
    Child(String name){
		 super(name);
	}

}
