package kr.co.himedia.review;

public class PostgresqlDriver implements Connection{

	@Override
	public void getConeection(String url, String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("url, username, password 정보를 이용하여 Postgresql DB를 접속 시도한다");
		
	}
}
