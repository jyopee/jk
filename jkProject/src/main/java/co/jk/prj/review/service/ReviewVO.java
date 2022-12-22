package co.jk.prj.review.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewVO {
	private int productReviewId;
	private int productId;
	private String memberId;
	private String productReviewTitle;
	private String productReviewSubject;
	private Date productReviewDate;
	private String productReviewImgName;
	private String productReviewImgPath;
	private int productReviewHit;
}
