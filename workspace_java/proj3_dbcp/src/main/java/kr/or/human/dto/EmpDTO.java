package kr.or.human.dto;
import java.sql.Date;

// DTO : Data Transfer Object
// VO : Value Object
public class EmpDTO {

    private	int empno;      //사원번호
    private String ename;   //사원명
    private String jod;
    private int mgr;
    private Date hiredate;
    private int sal;
    private Integer comm;
    private int deptno;
	
    
    public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJod() {
		return jod;
	}
	public void setJod(String jod) {
		this.jod = jod;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
    
    
}
