package quiz;

public class EmpExam {

	public static void main(String[] args) {

		Emp e = new Emp();
		e.empno = 7369;
		e.ename = "smith";
		e.sal = 800;
		e.mgr= 7902;
		
		EmpTable et = new EmpTable();
		et.insert(e);
	}

}
