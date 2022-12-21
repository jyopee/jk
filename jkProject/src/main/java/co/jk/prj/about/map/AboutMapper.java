package co.jk.prj.about.map;

import java.util.List;

import co.jk.prj.about.service.AboutVO;

public interface AboutMapper {

	List<AboutVO> aboutSelectList();

	AboutVO aboutSelect(AboutVO vo);

	int aboutInsert(AboutVO vo);

	int aboutDelete(AboutVO vo);

	int aboutUpdate(AboutVO vo);
	
}
