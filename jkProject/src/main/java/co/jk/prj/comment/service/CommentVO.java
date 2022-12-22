package co.jk.prj.comment.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentVO {
	private int productQnaCommentId;
	private String memberId;
	private int productQnaId;
	private Date productQnaCommentDate;
	private String productQnaCommentTitle;
	private String productQnaCommentSubject;
}	
