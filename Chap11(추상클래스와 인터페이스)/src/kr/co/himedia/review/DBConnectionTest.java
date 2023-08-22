package kr.co.himedia.review;

public class DBConnectionTest {
	
	public static void main(String[] args) {
		Connection  conn;
	
	conn = new OracleDriver();
	conn.getConeection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "himedia", "1128");
	
	
	conn = new PostgresqlDriver();
	conn.getConeection("jdbc:postgrsql://127.0.0.1:5432:himediadb", "himedia", "1128");
	
	conn = new MysqlDriver();
	conn.getConeection("jdbc:mysql://127.0.0.1:3306:himediadb", "himedia", "1128");
	
	
	}
	
	

}
