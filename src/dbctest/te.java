package dbctest;
import java.sql.*;
public class te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.jdbc.Driver";   // �s�u�u��
		   String url = "jdbc:mysql://localhost:3306/book";   // �ت��a����m
		   String user = "104021042";   // MySQL localhost ���Τ�W
		   String password = "19970218";   // MySQL localhost ���K�X
		   try {
		      Class.forName(driver);
		      Connection conn = DriverManager.getConnection(url, user, password);
		      if(conn != null && !conn.isClosed()){
		         System.out.println("��Ʈw�s�u���զ��\�I");
		         conn.close();
		      }
		   }
		   catch(ClassNotFoundException cnfe){
		      System.out.println("�䤣���X�ʵ{�����O");
		      cnfe.printStackTrace();
		   }
		   catch(SQLException sqle) {
		      sqle.printStackTrace();
		   }
		}
}

