package kr.co.himeida.constructor02;

public class UserInfo {
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String phoneNumber;
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassword = userPassWord;
		this.userName = userName;
	}
	public UserInfo() {};
	
	public String showUserInfo() {
		return "고객님의 아이디는 "+userId+"이고, 등록된 이름은 "+userName+"입니다.";
	}

}
