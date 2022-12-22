package co.jk.prj.img.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImgVO {
	private int productImgId;
	private int productId;
	private int productReviewId;
	private String productImgName;
	private String productImgPath;
}
