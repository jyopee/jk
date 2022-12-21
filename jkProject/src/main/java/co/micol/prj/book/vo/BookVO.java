package co.micol.prj.book.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookVO {
	private String bookCode;
	private String bookTitle;
	private String bookAuthor;
	private String bookPress;
	private int bookPrice;
}
