package co.jk.prj.member.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberPhoneNum;
	private String memberEmail;
	private String memberAddress;
	private int memberRoll;
}
