package sec01.exam01;

public class Parent {
//	Parent() {
//		System.out.println("Parent ������ ����");
//	}
	Parent(int a) {
		System.out.println("Parent ������ ����");
	}

	String name = "Parent�� name";
	
	String getName() {
		System.out.println("Parent�� getname����");
		return this.name;
	}
	
	Parent(String name){
		this.name = name;
	}
}
