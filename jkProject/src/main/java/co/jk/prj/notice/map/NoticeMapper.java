package co.jk.prj.notice.map;

import java.util.List;

import co.jk.prj.notice.service.NoticeVO;

public interface NoticeMapper {
	List<NoticeVO> noticeSelectList();

	NoticeVO noticeSelect(NoticeVO vo);

	int noticeInsert(NoticeVO vo);

	int noticeDelete(NoticeVO vo);

	int noticeUpdate(NoticeVO vo);
}
