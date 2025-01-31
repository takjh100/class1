package quiz;

import java.util.ArrayList;

public class EmpTable {

	ArrayList list = new ArrayList();
	
	void insret(Emp emp) {
		this.list.add(emp);
	}
	
 
	void select() {
		for(int i=0; i<list.size(); i++) {
			Emp e = (Emp)list.get(i);
			System.out.println(e.empno +", "+
					           e.ename +", "+
					           e.sal +", "+
					           e.mgr);
			System.out.println();
		}
	}
}
