package proj_kptn_tak;

public class TB_PR_1200MTDTO {

	String LIUN_NM;			//라인호기명
	String ITEM_NM;			//품목명
	String UNIT_NO;			//호기번호
	int DLY_PRDC_QNTT;		//일별생산량
	int DLY_DFC_RT;			//일별불량률
	int INDC_QNTT;			//지시수량
	
	
	public String getLIUN_NM() {
		return LIUN_NM;
	}
	public void setLIUN_NM(String lIUN_NM) {
		LIUN_NM = lIUN_NM;
	}
	public String getITEM_NM() {
		return ITEM_NM;
	}
	public void setITEM_NM(String iTEM_NM) {
		ITEM_NM = iTEM_NM;
	}
	public String getUNIT_NO() {
		return UNIT_NO;
	}
	public void setUNIT_NO(String uNIT_NO) {
		UNIT_NO = uNIT_NO;
	}
	public int getDLY_PRDC_QNTT() {
		return DLY_PRDC_QNTT;
	}
	public void setDLY_PRDC_QNTT(int dLY_PRDC_QNTT) {
		DLY_PRDC_QNTT = dLY_PRDC_QNTT;
	}
	public int getDLY_DFC_RT() {
		return DLY_DFC_RT;
	}
	public void setDLY_DFC_RT(int dLY_DFC_RT) {
		DLY_DFC_RT = dLY_DFC_RT;
	}
	public int getINDC_QNTT() {
		return INDC_QNTT;
	}
	public void setINDC_QNTT(int iNDC_QNTT) {
		INDC_QNTT = iNDC_QNTT;
	}
}
