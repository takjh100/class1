package sec05.exam02_static;

public class Singleton {
	
//	Singleton singleton = null;
//	
//	Singleton getInstance() {
//		
//		if(singleton == null) {
//			singleton = new Singleton(); 
//		}
//		return singleton; 
//	}
	
	
	private Singleton() {}
	static Singleton singleton = new Singleton();
	
	static Singleton getInstance() {
		return singleton;
	}
	

}
