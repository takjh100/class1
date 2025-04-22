package kr.or.ktpn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ktpn.dao.KW_DAO_mb_1000mt;
import kr.or.ktpn.dto.KW_DTO_MB_1000MT;

@Service
public class KW_Svc_mb_1000mtimpl implements KW_Svc_mb_1000mt {

	@Autowired
	KW_DAO_mb_1000mt mb;
	
	@Override
	public List<KW_DTO_MB_1000MT> getMemberlist() {
		List list = mb.selectMember();
		return list;
	}

}
