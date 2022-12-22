package co.jk.prj.product.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVO {
	private int productId;
	private int productCategoryId;
	private int productEventId;
	private int productHit;
	private String productName;
	private Date productDate;
	private int productPrice;
}
