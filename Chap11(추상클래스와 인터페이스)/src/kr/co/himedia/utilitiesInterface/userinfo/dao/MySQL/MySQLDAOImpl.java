package kr.co.himedia.utilitiesInterface.userinfo.dao.MySQL;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;

public class MySQLDAOImpl implements UserInfoDAO {
	
	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert into MySQL DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("update into MySQL DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("delete into MySQL DB userid = " + userInfoDTO.getUserId());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("select into MySQL DB userid = " + userInfoDTO.getUserId());
	}
	

}



