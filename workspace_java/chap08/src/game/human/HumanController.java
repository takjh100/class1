package game.human;

public class HumanController {

	public static void main(String[] args) {

		String id = "admin";
	    String pw = "1234";
	    
	    HumanDTO dto = new HumanDTO();
	    dto.setId(id);
	    dto.setPw(pw);
		
		HumanService service = new HumanServiceImpl();
//		HumanDTO dto = service.getMember(dto);
		dto = service.getMember(dto);
		
		if(dto != null) {
			System.out.println("�α��� ����");
			System.out.println("�ȳ��ϼ���!"+dto.getName() + "��");
			System.out.println("���� �������� �̵�");
		}else {
			System.out.println("�α��� ����");
			System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ���");
		}
		
	}

}
