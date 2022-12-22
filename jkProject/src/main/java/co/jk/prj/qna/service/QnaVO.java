package co.jk.prj.qna.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class QnaVO {
	private int productQnaId;
	private int productId;
	private String memberId;
	private String productQnaTitle;
	private String productQnaSubject;
	private Date productReviewDate;
	private int productQnaHit;
	private int productQnaSecret;
}
