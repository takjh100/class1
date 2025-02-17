package sec01.exam01;

public class Parent {
//	Parent() {
//		System.out.println("Parent 积己磊 角青");
//	}
	Parent(int a) {
		System.out.println("Parent 积己磊 角青");
	}

	String name = "Parent狼 name";
	
	String getName() {
		System.out.println("Parent狼 getname角青");
		return this.name;
	}
	
	Parent(String name){
		this.name = name;
	}
}
