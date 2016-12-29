package dbctest;
import java.sql.*;
public class te {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.jdbc.Driver";   // 連線工具
		   String url = "jdbc:mysql://localhost:3306/book";   // 目的地的位置
		   String user = "104021042";   // MySQL localhost 的用戶名
		   String password = "19970218";   // MySQL localhost 的密碼
		   try {
		      Class.forName(driver);
		      Connection conn = DriverManager.getConnection(url, user, password);
		      if(conn != null && !conn.isClosed()){
		         System.out.println("資料庫連線測試成功！");
		         conn.close();
		      }
		   }
		   catch(ClassNotFoundException cnfe){
		      System.out.println("找不到驅動程式類別");
		      cnfe.printStackTrace();
		   }
		   catch(SQLException sqle) {
		      sqle.printStackTrace();
		   }
		}
}

