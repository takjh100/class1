package proj_kptn_tak;

public class test_TB_PR_1000MT_DTO {
 
	private String PROD_CD;
	private String LIUN_CD;
	private String LIUN_NM;
	private int INDC_QNTT;
	
	
	public String getPROD_CD() {
		return PROD_CD;
	}
	public void setPROD_CD(String pROD_CD) {
		PROD_CD = pROD_CD;
	}
	public String getLIUN_CD() {
		return LIUN_CD;
	}
	public void setLIUN_CD(String lIUN_CD) {
		LIUN_CD = lIUN_CD;
	}
	public String getLIUN_NM() {
		return LIUN_NM;
	}
	public void setLIUN_NM(String lIUN_NM) {
		LIUN_NM = lIUN_NM;
	}
	public int getINDC_QNTT() {
		return INDC_QNTT;
	}
	public void setINDC_QNTT(int iNDC_QNTT) {
		INDC_QNTT = iNDC_QNTT;
	}
	
	@Override
	public String toString() {
		return "test_TB_PR_1000MT_DTO [PROD_CD=" + PROD_CD + ", LIUN_CD=" + LIUN_CD + ", LIUN_NM=" + LIUN_NM
				+ ", INDC_QNTT=" + INDC_QNTT + "]";
	}
	
	
}
