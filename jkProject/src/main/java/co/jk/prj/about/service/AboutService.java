package co.jk.prj.about.service;

import java.util.List;

public interface AboutService {
	List<AboutVO> aboutSelectList();
	
	AboutVO aboutSelect(AboutVO vo);
	int aboutInsert(AboutVO vo);
	int aboutDelete(AboutVO vo);
	int aboutUpdate(AboutVO vo);
	
}
