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
			System.out.println("로그인 성공");
			System.out.println("안녕하세요!"+dto.getName() + "님");
			System.out.println("메인 페이지로 이동");
		}else {
			System.out.println("로그인 실패");
			System.out.println("아이디와 비밀번호를 확인해주세요");
		}
		
	}

}
